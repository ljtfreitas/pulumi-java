// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Healthcare API resource.
 * 
 */
public final class CloudHealthcareSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudHealthcareSourceResponse Empty = new CloudHealthcareSourceResponse();

    /**
     * Full path of a Cloud Healthcare API resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public CloudHealthcareSourceResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private CloudHealthcareSourceResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudHealthcareSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudHealthcareSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public CloudHealthcareSourceResponse build() {
            return new CloudHealthcareSourceResponse(name);
        }
    }
}
