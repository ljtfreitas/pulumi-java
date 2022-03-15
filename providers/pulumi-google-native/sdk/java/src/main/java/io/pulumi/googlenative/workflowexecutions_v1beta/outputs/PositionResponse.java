// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PositionResponse {
    /**
     * The source code column position (of the line) the current instruction was generated from.
     * 
     */
    private final String column;
    /**
     * The number of bytes of source code making up this stack trace element.
     * 
     */
    private final String length;
    /**
     * The source code line number the current instruction was generated from.
     * 
     */
    private final String line;

    @CustomType.Constructor
    private PositionResponse(
        @CustomType.Parameter("column") String column,
        @CustomType.Parameter("length") String length,
        @CustomType.Parameter("line") String line) {
        this.column = column;
        this.length = length;
        this.line = line;
    }

    /**
     * The source code column position (of the line) the current instruction was generated from.
     * 
    */
    public String getColumn() {
        return this.column;
    }
    /**
     * The number of bytes of source code making up this stack trace element.
     * 
    */
    public String getLength() {
        return this.length;
    }
    /**
     * The source code line number the current instruction was generated from.
     * 
    */
    public String getLine() {
        return this.line;
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
