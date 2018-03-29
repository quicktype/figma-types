package io.quicktype;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

/**
 * A text box
 *
 * A regular n-sided polygon
 *
 * An ellipse
 *
 * A logical grouping of nodes
 *
 * An array of nodes that are direct children of this node
 *
 * A group that has a boolean operation applied to it
 *
 * A regular star shape
 *
 * A straight line
 *
 * A rectangular region of the canvas that can be exported
 *
 * A node that can have instances created of it that share the same properties
 *
 * An instance of a component, changes to the component result in the same changes applied
 * to the instance
 *
 * Properties are shared across all nodes
 *
 * See type property for effect of this field
 *
 * Red channel value, between 0 and 1
 *
 * Green channel value, between 0 and 1
 *
 * Blue channel value, between 0 and 1
 *
 * Alpha channel value, between 0 and 1
 *
 * X coordinate of the vector
 *
 * Y coordinate of the vector
 *
 * Opacity of the node
 *
 * The weight of strokes on the node
 *
 * Overall opacity of paint (colors within the paint can also have opacity values which
 * would blend with this)
 *
 * Value between 0 and 1 representing position along gradient axis
 *
 * X coordinate of top left corner of the rectangle
 *
 * Y coordinate of top left corner of the rectangle
 *
 * Width of the rectangle
 *
 * Height of the rectangle
 *
 * Width of column grid or height of row grid or square grid spacing
 *
 * Spacing in between columns and rows
 *
 * Spacing before the first column or row
 *
 * Number of columns or rows
 *
 * Radius of each corner of the rectangle
 *
 * Line height in px
 *
 * Numeric font weight
 *
 * Line height as a percentage of normal line height
 *
 * Font size in px
 *
 * Space between characters in px
 *
 * Array with same number of elements as characeters in text box, each element is a
 * reference to the styleOverrideTable defined below and maps to the corresponding character
 * in the characters field. Elements with value 0 have the default type style
 *
 * Whether or not the node is visible on the canvas
 *
 * Is the paint enabled?
 *
 * Does this node mask sibling nodes in front of it?
 *
 * How this node blends with nodes behind it in the scene (see blend mode section for more
 * details)
 *
 * Is the grid currently visible?
 *
 * Does this node clip content outside of its bounds?
 *
 * Is text italicized?
 *
 * A string uniquely identifying this node within the document
 *
 * The name given to the node by the user in the tool
 *
 * Node ID of node to transition to in prototyping
 *
 * File suffix to append to all filenames
 *
 * Text contained within text box
 *
 * PostScript font name
 *
 * Font family of text (standard name)
 *
 * ID of component that this instance came from, refers to components table (see endpoints
 * section below)
 *
 * Unique identifier for comment
 *
 * The file in which the comment lives
 *
 * If present, the id of the comment to which this is the reply
 */
public class TextNode {
    private String id;
    private String name;
    private boolean visible;
    private RegularPolygonNodeType type;
    private EffectElement[] effects;
    private double opacity;
    private StrokeAlign strokeAlign;
    private double strokeWeight;
    private PaintElement[] fills;
    private RegularPolygonNodeRectangle absoluteBoundingBox;
    private String transitionNodeID;
    private BlendMode blendMode;
    private RegularPolygonNodeLayoutConstraint constraints;
    private boolean isMask;
    private ExportSettingElement[] exportSettings;
    private PaintElement[] strokes;
    private boolean preserveRatio;
    private String characters;
    private NodeTypeStyle style;
    private double[] characterStyleOverrides;
    private Map<String, NodeTypeStyle> styleOverrideTable;

    /**
     * A string uniquely identifying this node within the document
     */
    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    /**
     * The name given to the node by the user in the tool
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Whether or not the node is visible on the canvas
     */
    @JsonProperty("visible")
    public boolean getVisible() { return visible; }
    @JsonProperty("visible")
    public void setVisible(boolean value) { this.visible = value; }

    /**
     * The type of the node
     */
    @JsonProperty("type")
    public RegularPolygonNodeType getType() { return type; }
    @JsonProperty("type")
    public void setType(RegularPolygonNodeType value) { this.type = value; }

    /**
     * An array of effects attached to this node (see effects section for more details)
     */
    @JsonProperty("effects")
    public EffectElement[] getEffects() { return effects; }
    @JsonProperty("effects")
    public void setEffects(EffectElement[] value) { this.effects = value; }

    /**
     * Opacity of the node
     */
    @JsonProperty("opacity")
    public double getOpacity() { return opacity; }
    @JsonProperty("opacity")
    public void setOpacity(double value) { this.opacity = value; }

    /**
     * Where stroke is drawn relative to the vector outline as a string enum
     *
     * * INSIDE: draw stroke inside the shape boundary
     * * OUTSIDE: draw stroke outside the shape boundary
     * * CENTER: draw stroke centered along the shape boundary
     */
    @JsonProperty("strokeAlign")
    public StrokeAlign getStrokeAlign() { return strokeAlign; }
    @JsonProperty("strokeAlign")
    public void setStrokeAlign(StrokeAlign value) { this.strokeAlign = value; }

    /**
     * The weight of strokes on the node
     */
    @JsonProperty("strokeWeight")
    public double getStrokeWeight() { return strokeWeight; }
    @JsonProperty("strokeWeight")
    public void setStrokeWeight(double value) { this.strokeWeight = value; }

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
    public RegularPolygonNodeRectangle getAbsoluteBoundingBox() { return absoluteBoundingBox; }
    @JsonProperty("absoluteBoundingBox")
    public void setAbsoluteBoundingBox(RegularPolygonNodeRectangle value) { this.absoluteBoundingBox = value; }

    /**
     * Node ID of node to transition to in prototyping
     */
    @JsonProperty("transitionNodeID")
    public String getTransitionNodeID() { return transitionNodeID; }
    @JsonProperty("transitionNodeID")
    public void setTransitionNodeID(String value) { this.transitionNodeID = value; }

    /**
     * How this node blends with nodes behind it in the scene (see blend mode section for more
     * details)
     */
    @JsonProperty("blendMode")
    public BlendMode getBlendMode() { return blendMode; }
    @JsonProperty("blendMode")
    public void setBlendMode(BlendMode value) { this.blendMode = value; }

    /**
     * How this node blends with nodes behind it in the scene (see blend mode section for more
     * details)
     */
    @JsonProperty("constraints")
    public RegularPolygonNodeLayoutConstraint getConstraints() { return constraints; }
    @JsonProperty("constraints")
    public void setConstraints(RegularPolygonNodeLayoutConstraint value) { this.constraints = value; }

    /**
     * Does this node mask sibling nodes in front of it?
     */
    @JsonProperty("isMask")
    public boolean getIsMask() { return isMask; }
    @JsonProperty("isMask")
    public void setIsMask(boolean value) { this.isMask = value; }

    /**
     * An array of export settings representing images to export from node
     */
    @JsonProperty("exportSettings")
    public ExportSettingElement[] getExportSettings() { return exportSettings; }
    @JsonProperty("exportSettings")
    public void setExportSettings(ExportSettingElement[] value) { this.exportSettings = value; }

    /**
     * An array of stroke paints applied to the node
     */
    @JsonProperty("strokes")
    public PaintElement[] getStrokes() { return strokes; }
    @JsonProperty("strokes")
    public void setStrokes(PaintElement[] value) { this.strokes = value; }

    /**
     * How this node blends with nodes behind it in the scene (see blend mode section for more
     * details)
     */
    @JsonProperty("preserveRatio")
    public boolean getPreserveRatio() { return preserveRatio; }
    @JsonProperty("preserveRatio")
    public void setPreserveRatio(boolean value) { this.preserveRatio = value; }

    /**
     * Text contained within text box
     */
    @JsonProperty("characters")
    public String getCharacters() { return characters; }
    @JsonProperty("characters")
    public void setCharacters(String value) { this.characters = value; }

    /**
     * Style of text including font family and weight (see type style section for more
     * information)
     */
    @JsonProperty("style")
    public NodeTypeStyle getStyle() { return style; }
    @JsonProperty("style")
    public void setStyle(NodeTypeStyle value) { this.style = value; }

    /**
     * Array with same number of elements as characeters in text box, each element is a
     * reference to the styleOverrideTable defined below and maps to the corresponding character
     * in the characters field. Elements with value 0 have the default type style
     */
    @JsonProperty("characterStyleOverrides")
    public double[] getCharacterStyleOverrides() { return characterStyleOverrides; }
    @JsonProperty("characterStyleOverrides")
    public void setCharacterStyleOverrides(double[] value) { this.characterStyleOverrides = value; }

    /**
     * Map from ID to TypeStyle for looking up style overrides
     */
    @JsonProperty("styleOverrideTable")
    public Map<String, NodeTypeStyle> getStyleOverrideTable() { return styleOverrideTable; }
    @JsonProperty("styleOverrideTable")
    public void setStyleOverrideTable(Map<String, NodeTypeStyle> value) { this.styleOverrideTable = value; }
}