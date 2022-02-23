// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediastore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPolicyState Empty = new ContainerPolicyState();

    /**
     * The name of the container.
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * The contents of the policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public ContainerPolicyState(
        @Nullable Input<String> containerName,
        @Nullable Input<String> policy) {
        this.containerName = containerName;
        this.policy = policy;
    }

    private ContainerPolicyState() {
        this.containerName = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private @Nullable Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.policy = defaults.policy;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }
        public ContainerPolicyState build() {
            return new ContainerPolicyState(containerName, policy);
        }
    }
}
