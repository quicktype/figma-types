package io.quicktype;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

/**
 * A rectangle
 *
 * Bounding box of the node in absolute space coordinates
 *
 * An array of nodes that are being boolean operated on
 *
 * An array of nodes that are direct children of this node
 *
 * An array of top level layers on the canvas
 *
 * An array of canvases attached to the document
 */
public class AbsoluteBoundingBox {
    private EffectElement[] effects;
    private Double cornerRadius;
    private Double opacity;
    private String name;
    private StrokeAlign strokeAlign;
    private Double strokeWeight;
    private PaintElement[] fills;
    private AbsoluteBoundingBox absoluteBoundingBox;
    private String transitionNodeID;
    private Boolean visible;
    private BlendMode blendMode;
    private Constraints constraints;
    private Boolean isMask;
    private ExportSettingElement[] exportSettings;
    private NodeType type;
    private String id;
    private PaintElement[] strokes;
    private Boolean preserveRatio;

    /**
     * An array of effects attached to this node
     * (see effects sectionfor more details)
     */
    @JsonProperty("effects")
    public EffectElement[] getEffects() { return effects; }
    @JsonProperty("effects")
    public void setEffects(EffectElement[] value) { this.effects = value; }

    /**
     * Radius of each corner of the rectangle
     */
    @JsonProperty("cornerRadius")
    public Double getCornerRadius() { return cornerRadius; }
    @JsonProperty("cornerRadius")
    public void setCornerRadius(Double value) { this.cornerRadius = value; }

    /**
     * Opacity of the node
     */
    @JsonProperty("opacity")
    public Double getOpacity() { return opacity; }
    @JsonProperty("opacity")
    public void setOpacity(Double value) { this.opacity = value; }

    /**
     * the name given to the node by the user in the tool.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Where stroke is drawn relative to the vector outline as a string enum
     * "INSIDE": draw stroke inside the shape boundary
     * "OUTSIDE": draw stroke outside the shape boundary
     * "CENTER": draw stroke centered along the shape boundary
     */
    @JsonProperty("strokeAlign")
    public StrokeAlign getStrokeAlign() { return strokeAlign; }
    @JsonProperty("strokeAlign")
    public void setStrokeAlign(StrokeAlign value) { this.strokeAlign = value; }

    /**
     * The weight of strokes on the node
     */
    @JsonProperty("strokeWeight")
    public Double getStrokeWeight() { return strokeWeight; }
    @JsonProperty("strokeWeight")
    public void setStrokeWeight(Double value) { this.strokeWeight = value; }

    /**
     * An array of fill paints applied to the node
     */
    @JsonProperty("fills")
    public PaintElement[] getFills() { return fills; }
    @JsonProperty("fills")
    public void setFills(PaintElement[] value) { this.fills = value; }

    /**
     * Bounding box of the node in absolute space coordinates
     */
    @JsonProperty("absoluteBoundingBox")
    public AbsoluteBoundingBox getAbsoluteBoundingBox() { return absoluteBoundingBox; }
    @JsonProperty("absoluteBoundingBox")
    public void setAbsoluteBoundingBox(AbsoluteBoundingBox value) { this.absoluteBoundingBox = value; }

    /**
     * Node ID of node to transition to in prototyping
     */
    @JsonProperty("transitionNodeID")
    public String getTransitionNodeID() { return transitionNodeID; }
    @JsonProperty("transitionNodeID")
    public void setTransitionNodeID(String value) { this.transitionNodeID = value; }

    /**
     * whether or not the node is visible on the canvas
     */
    @JsonProperty("visible")
    public Boolean getVisible() { return visible; }
    @JsonProperty("visible")
    public void setVisible(Boolean value) { this.visible = value; }

    /**
     * How this node blends with nodes behind it in the scene
     * (see blend mode section for more details)
     */
    @JsonProperty("blendMode")
    public BlendMode getBlendMode() { return blendMode; }
    @JsonProperty("blendMode")
    public void setBlendMode(BlendMode value) { this.blendMode = value; }

    /**
     * Horizontal and vertical layout constraints for node
     */
    @JsonProperty("constraints")
    public Constraints getConstraints() { return constraints; }
    @JsonProperty("constraints")
    public void setConstraints(Constraints value) { this.constraints = value; }

    /**
     * Does this node mask sibling nodes in front of it?
     */
    @JsonProperty("isMask")
    public Boolean getIsMask() { return isMask; }
    @JsonProperty("isMask")
    public void setIsMask(Boolean value) { this.isMask = value; }

    /**
     * An array of export settings representing images to export from node
     */
    @JsonProperty("exportSettings")
    public ExportSettingElement[] getExportSettings() { return exportSettings; }
    @JsonProperty("exportSettings")
    public void setExportSettings(ExportSettingElement[] value) { this.exportSettings = value; }

    /**
     * the type of the node, refer to table below for details
     */
    @JsonProperty("type")
    public NodeType getType() { return type; }
    @JsonProperty("type")
    public void setType(NodeType value) { this.type = value; }

    /**
     * a string uniquely identifying this node within the document
     */
    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    /**
     * An array of stroke paints applied to the node
     */
    @JsonProperty("strokes")
    public PaintElement[] getStrokes() { return strokes; }
    @JsonProperty("strokes")
    public void setStrokes(PaintElement[] value) { this.strokes = value; }

    /**
     * Keep height and width constrained to same ratio
     */
    @JsonProperty("preserveRatio")
    public Boolean getPreserveRatio() { return preserveRatio; }
    @JsonProperty("preserveRatio")
    public void setPreserveRatio(Boolean value) { this.preserveRatio = value; }
}