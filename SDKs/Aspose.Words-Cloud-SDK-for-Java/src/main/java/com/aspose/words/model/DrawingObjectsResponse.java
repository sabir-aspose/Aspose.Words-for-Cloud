package com.aspose.words.model;

import com.aspose.words.model.DrawingObjects;
public class DrawingObjectsResponse {
  private DrawingObjects DrawingObjects = null;
  private String Code = null;
  private String Status = null;
  /**
	 * getDrawingObjects
	 * Gets DrawingObjects
	 * @return DrawingObjects
	 */
  public DrawingObjects getDrawingObjects() {
    return DrawingObjects;
  }

	/**
	 * setDrawingObjects
	 * Sets DrawingObjects
	 * @param DrawingObjects DrawingObjects
	 */
  public void setDrawingObjects(DrawingObjects DrawingObjects) {
    this.DrawingObjects = DrawingObjects;
  }

  /**
	 * getCode
	 * Gets String
	 * @return Code
	 */
  public String getCode() {
    return Code;
  }

	/**
	 * setCode
	 * Sets String
	 * @param Code String
	 */
  public void setCode(String Code) {
    this.Code = Code;
  }

  /**
	 * getStatus
	 * Gets String
	 * @return Status
	 */
  public String getStatus() {
    return Status;
  }

	/**
	 * setStatus
	 * Sets String
	 * @param Status String
	 */
  public void setStatus(String Status) {
    this.Status = Status;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObjectsResponse {\n");
    sb.append("  DrawingObjects: ").append(DrawingObjects).append("\n");
    sb.append("  Code: ").append(Code).append("\n");
    sb.append("  Status: ").append(Status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
