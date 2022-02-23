// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchTemplateIamInstanceProfile {
    /**
     * Amazon Resource Name (ARN) of the launch template.
     * 
     */
    private final String arn;
    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"arn","name"})
    private GetLaunchTemplateIamInstanceProfile(
        String arn,
        String name) {
        this.arn = Objects.requireNonNull(arn);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Amazon Resource Name (ARN) of the launch template.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
     * 
     */
    public String getName() {
        return this.name;
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

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetLaunchTemplateIamInstanceProfile build() {
            return new GetLaunchTemplateIamInstanceProfile(arn, name);
        }
    }
}
