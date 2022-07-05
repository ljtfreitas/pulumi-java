// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DSSEHintResponse {
    /**
     * @return The human readable name of this attestation authority, for example &#34;cloudbuild-prod&#34;.
     * 
     */
    private final String humanReadableName;

    @CustomType.Constructor
    private DSSEHintResponse(@CustomType.Parameter("humanReadableName") String humanReadableName) {
        this.humanReadableName = humanReadableName;
    }

    /**
     * @return The human readable name of this attestation authority, for example &#34;cloudbuild-prod&#34;.
     * 
     */
    public String humanReadableName() {
        return this.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEHintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEHintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder humanReadableName(String humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }        public DSSEHintResponse build() {
            return new DSSEHintResponse(humanReadableName);
        }
    }
}
