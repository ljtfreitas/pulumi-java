// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetState extends io.pulumi.resources.ResourceArgs {

    public static final TargetState Empty = new TargetState();

    /**
     * The max capacity of the scalable target.
     * 
     */
    @Import(name="maxCapacity")
      private final @Nullable Output<Integer> maxCapacity;

    public Output<Integer> getMaxCapacity() {
        return this.maxCapacity == null ? Output.empty() : this.maxCapacity;
    }

    /**
     * The min capacity of the scalable target.
     * 
     */
    @Import(name="minCapacity")
      private final @Nullable Output<Integer> minCapacity;

    public Output<Integer> getMinCapacity() {
        return this.minCapacity == null ? Output.empty() : this.minCapacity;
    }

    /**
     * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="scalableDimension")
      private final @Nullable Output<String> scalableDimension;

    public Output<String> getScalableDimension() {
        return this.scalableDimension == null ? Output.empty() : this.scalableDimension;
    }

    /**
     * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="serviceNamespace")
      private final @Nullable Output<String> serviceNamespace;

    public Output<String> getServiceNamespace() {
        return this.serviceNamespace == null ? Output.empty() : this.serviceNamespace;
    }

    public TargetState(
        @Nullable Output<Integer> maxCapacity,
        @Nullable Output<Integer> minCapacity,
        @Nullable Output<String> resourceId,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> scalableDimension,
        @Nullable Output<String> serviceNamespace) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.resourceId = resourceId;
        this.roleArn = roleArn;
        this.scalableDimension = scalableDimension;
        this.serviceNamespace = serviceNamespace;
    }

    private TargetState() {
        this.maxCapacity = Output.empty();
        this.minCapacity = Output.empty();
        this.resourceId = Output.empty();
        this.roleArn = Output.empty();
        this.scalableDimension = Output.empty();
        this.serviceNamespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxCapacity;
        private @Nullable Output<Integer> minCapacity;
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> scalableDimension;
        private @Nullable Output<String> serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.scalableDimension = defaults.scalableDimension;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder maxCapacity(@Nullable Output<Integer> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = Output.ofNullable(maxCapacity);
            return this;
        }

        public Builder minCapacity(@Nullable Output<Integer> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder minCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = Output.ofNullable(minCapacity);
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }

        public Builder scalableDimension(@Nullable Output<String> scalableDimension) {
            this.scalableDimension = scalableDimension;
            return this;
        }

        public Builder scalableDimension(@Nullable String scalableDimension) {
            this.scalableDimension = Output.ofNullable(scalableDimension);
            return this;
        }

        public Builder serviceNamespace(@Nullable Output<String> serviceNamespace) {
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        public Builder serviceNamespace(@Nullable String serviceNamespace) {
            this.serviceNamespace = Output.ofNullable(serviceNamespace);
            return this;
        }
        public TargetState build() {
            return new TargetState(maxCapacity, minCapacity, resourceId, roleArn, scalableDimension, serviceNamespace);
        }
    }
}
