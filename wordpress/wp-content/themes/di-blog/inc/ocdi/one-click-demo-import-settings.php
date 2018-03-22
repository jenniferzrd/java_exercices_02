<?php

function di_blog_ocdi_import_files() {
	return array(
		array(
			'import_file_name'             => 'Di Blog Demo Site',
			'categories'                   => array( 'Di Blog Demo Main' ),
			'local_import_file'            => trailingslashit( get_template_directory() ) . 'inc/ocdi/files/demo-content.xml',
			'local_import_widget_file'     => trailingslashit( get_template_directory() ) . 'inc/ocdi/files/widgets.wie',
			'local_import_customizer_file' => trailingslashit( get_template_directory() ) . 'inc/ocdi/files/customizer.dat',
			'import_preview_image_url'     => trailingslashit( get_template_directory() ) . 'screenshot.png',
			'import_notice'                => __( 'Make sure Elementor Page Builder, Contact Form 7, WooCommerce (optional) plugins are activated.', 'di-blog' ),
			'preview_url'                  => 'http://demo.dithemes.com/di-blog/',
		),
	);
}
add_filter( 'pt-ocdi/import_files', 'di_blog_ocdi_import_files' );

function di_blog_after_import_setup() {
	// Assign menus to their locations.
	$primary_menu = get_term_by( 'slug', 'topmain', 'nav_menu' );
	$sidebar_menu = get_term_by( 'slug', 'sidemenu', 'nav_menu' );

	set_theme_mod( 'nav_menu_locations', array(
			'primary' => $primary_menu->term_id,
			'sidebar' => $sidebar_menu->term_id,
		)
	);

	update_option( 'show_on_front', 'posts' );

}
add_action( 'pt-ocdi/after_import', 'di_blog_after_import_setup' );

add_filter( 'pt-ocdi/disable_pt_branding', '__return_true' );

