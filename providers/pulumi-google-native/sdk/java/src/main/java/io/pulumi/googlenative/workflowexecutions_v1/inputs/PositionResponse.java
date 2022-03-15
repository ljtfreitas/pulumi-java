// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Position contains source position information about the stack trace element such as line number, column number and length of the code block in bytes.
 * 
 */
public final class PositionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PositionResponse Empty = new PositionResponse();

    /**
     * The source code column position (of the line) the current instruction was generated from.
     * 
     */
    @Import(name="column", required=true)
      private final String column;

    public String getColumn() {
        return this.column;
    }

    /**
     * The number of bytes of source code making up this stack trace element.
     * 
     */
    @Import(name="length", required=true)
      private final String length;

    public String getLength() {
        return this.length;
    }

    /**
     * The source code line number the current instruction was generated from.
     * 
     */
    @Import(name="line", required=true)
      private final String line;

    public String getLine() {
        return this.line;
    }

    public PositionResponse(
        String column,
        String length,
        String line) {
        this.column = Objects.requireNonNull(column, "expected parameter 'column' to be non-null");
        this.length = Objects.requireNonNull(length, "expected parameter 'length' to be non-null");
        this.line = Objects.requireNonNull(line, "expected parameter 'line' to be non-null");
    }

    private PositionResponse() {
        this.column = null;
        this.length = null;
        this.line = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PositionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String column;
        private String length;
        private String line;

        public Builder() {
    	      // Empty
        }

        public Builder(PositionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.length = defaults.length;
    	      this.line = defaults.line;
        }

        public Builder column(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder length(String length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }

        public Builder line(String line) {
            this.line = Objects.requireNonNull(line);
            return this;
        }
        public PositionResponse build() {
            return new PositionResponse(column, length, line);
        }
    }
}
