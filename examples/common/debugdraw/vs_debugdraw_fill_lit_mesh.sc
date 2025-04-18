$input a_position
$output v_view, v_world

/*
 * Copyright 2011-2025 Branimir Karadzic. All rights reserved.
 * License: https://github.com/bkaradzic/bgfx/blob/master/LICENSE
 */

#include <bgfx_shader.sh>

void main()
{
	vec4 world = mul(u_model[0], vec4(a_position, 1.0) );
	gl_Position = mul(u_viewProj, world);
	v_view  = mul(u_view, world).xyz;
	v_world = world.xyz;
}
