// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchTemplateElasticGpuSpecification extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateElasticGpuSpecification Empty = new GetLaunchTemplateElasticGpuSpecification();

    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GetLaunchTemplateElasticGpuSpecification(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetLaunchTemplateElasticGpuSpecification() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateElasticGpuSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateElasticGpuSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLaunchTemplateElasticGpuSpecification build() {
            return new GetLaunchTemplateElasticGpuSpecification(type);
        }
    }
}
