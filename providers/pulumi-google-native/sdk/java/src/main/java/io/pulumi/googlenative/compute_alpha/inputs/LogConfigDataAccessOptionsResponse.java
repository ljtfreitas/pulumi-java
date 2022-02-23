// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigDataAccessOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogConfigDataAccessOptionsResponse Empty = new LogConfigDataAccessOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="logMode", required=true)
      private final String logMode;

    public String getLogMode() {
        return this.logMode;
    }

    public LogConfigDataAccessOptionsResponse(String logMode) {
        this.logMode = Objects.requireNonNull(logMode, "expected parameter 'logMode' to be non-null");
    }

    private LogConfigDataAccessOptionsResponse() {
        this.logMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigDataAccessOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigDataAccessOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder setLogMode(String logMode) {
            this.logMode = Objects.requireNonNull(logMode);
            return this;
        }
        public LogConfigDataAccessOptionsResponse build() {
            return new LogConfigDataAccessOptionsResponse(logMode);
        }
    }
}
