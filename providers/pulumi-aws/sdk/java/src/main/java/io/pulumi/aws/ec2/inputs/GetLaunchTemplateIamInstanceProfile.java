// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchTemplateIamInstanceProfile extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateIamInstanceProfile Empty = new GetLaunchTemplateIamInstanceProfile();

    /**
     * Amazon Resource Name (ARN) of the launch template.
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetLaunchTemplateIamInstanceProfile(
        String arn,
        String name) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetLaunchTemplateIamInstanceProfile() {
        this.arn = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateIamInstanceProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateIamInstanceProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetLaunchTemplateIamInstanceProfile build() {
            return new GetLaunchTemplateIamInstanceProfile(arn, name);
        }
    }
}
