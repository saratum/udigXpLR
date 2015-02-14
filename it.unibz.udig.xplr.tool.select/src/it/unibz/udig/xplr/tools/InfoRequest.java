package it.unibz.udig.xplr.tools;

import java.util.List;

import net.refractions.udig.project.ILayer;

import org.geotools.geometry.jts.ReferencedEnvelope;

public class InfoRequest
{

	public ReferencedEnvelope bbox;
	public List<ILayer> layers;

	public InfoRequest(ReferencedEnvelope bbox, List<ILayer> layers)
	{
		this.bbox = bbox;
		this.layers = layers;
	}
}
