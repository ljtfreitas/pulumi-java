// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataAccessOptionsResponse {
    private final String logMode;

    @OutputCustomType.Constructor({"logMode"})
    private DataAccessOptionsResponse(String logMode) {
        this.logMode = Objects.requireNonNull(logMode);
    }

    public String getLogMode() {
        return this.logMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataAccessOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataAccessOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder setLogMode(String logMode) {
            this.logMode = Objects.requireNonNull(logMode);
            return this;
        }
        public DataAccessOptionsResponse build() {
            return new DataAccessOptionsResponse(logMode);
        }
    }
}
