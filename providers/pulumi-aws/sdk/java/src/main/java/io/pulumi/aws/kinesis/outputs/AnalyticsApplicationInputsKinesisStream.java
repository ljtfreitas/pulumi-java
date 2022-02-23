// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnalyticsApplicationInputsKinesisStream {
    /**
     * The ARN of the Kinesis Stream.
     * 
     */
    private final String resourceArn;
    /**
     * The ARN of the IAM Role used to access the stream.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"resourceArn","roleArn"})
    private AnalyticsApplicationInputsKinesisStream(
        String resourceArn,
        String roleArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    /**
     * The ARN of the Kinesis Stream.
     * 
     */
    public String getResourceArn() {
        return this.resourceArn;
    }
    /**
     * The ARN of the IAM Role used to access the stream.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsKinesisStream defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsKinesisStream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AnalyticsApplicationInputsKinesisStream build() {
            return new AnalyticsApplicationInputsKinesisStream(resourceArn, roleArn);
        }
    }
}
