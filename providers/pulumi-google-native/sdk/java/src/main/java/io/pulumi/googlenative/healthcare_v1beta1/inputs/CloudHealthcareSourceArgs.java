// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Healthcare API resource.
 * 
 */
public final class CloudHealthcareSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudHealthcareSourceArgs Empty = new CloudHealthcareSourceArgs();

    /**
     * Full path of a Cloud Healthcare API resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public CloudHealthcareSourceArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private CloudHealthcareSourceArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudHealthcareSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudHealthcareSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public CloudHealthcareSourceArgs build() {
            return new CloudHealthcareSourceArgs(name);
        }
    }
}
