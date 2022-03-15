// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CaseClassificationResponse {
    /**
     * The display name of the classification.
     * 
     */
    private final String displayName;

    @CustomType.Constructor
    private CaseClassificationResponse(@CustomType.Parameter("displayName") String displayName) {
        this.displayName = displayName;
    }

    /**
     * The display name of the classification.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaseClassificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CaseClassificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public CaseClassificationResponse build() {
            return new CaseClassificationResponse(displayName);
        }
    }
}
