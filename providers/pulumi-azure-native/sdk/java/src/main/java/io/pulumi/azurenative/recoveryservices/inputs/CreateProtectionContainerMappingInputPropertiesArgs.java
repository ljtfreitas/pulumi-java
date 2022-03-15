// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.A2AContainerMappingInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.VMwareCbtContainerMappingInputArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configure pairing input properties.
 * 
 */
public final class CreateProtectionContainerMappingInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateProtectionContainerMappingInputPropertiesArgs Empty = new CreateProtectionContainerMappingInputPropertiesArgs();

    /**
     * Applicable policy.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> getPolicyId() {
        return this.policyId == null ? Output.empty() : this.policyId;
    }

    /**
     * Provider specific input for pairing.
     * 
     */
    @Import(name="providerSpecificInput")
      private final @Nullable Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> providerSpecificInput;

    public Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> getProviderSpecificInput() {
        return this.providerSpecificInput == null ? Output.empty() : this.providerSpecificInput;
    }

    /**
     * The target unique protection container name.
     * 
     */
    @Import(name="targetProtectionContainerId")
      private final @Nullable Output<String> targetProtectionContainerId;

    public Output<String> getTargetProtectionContainerId() {
        return this.targetProtectionContainerId == null ? Output.empty() : this.targetProtectionContainerId;
    }

    public CreateProtectionContainerMappingInputPropertiesArgs(
        @Nullable Output<String> policyId,
        @Nullable Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> providerSpecificInput,
        @Nullable Output<String> targetProtectionContainerId) {
        this.policyId = policyId;
        this.providerSpecificInput = providerSpecificInput;
        this.targetProtectionContainerId = targetProtectionContainerId;
    }

    private CreateProtectionContainerMappingInputPropertiesArgs() {
        this.policyId = Output.empty();
        this.providerSpecificInput = Output.empty();
        this.targetProtectionContainerId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateProtectionContainerMappingInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policyId;
        private @Nullable Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> providerSpecificInput;
        private @Nullable Output<String> targetProtectionContainerId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateProtectionContainerMappingInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.providerSpecificInput = defaults.providerSpecificInput;
    	      this.targetProtectionContainerId = defaults.targetProtectionContainerId;
        }

        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            this.policyId = Output.ofNullable(policyId);
            return this;
        }

        public Builder providerSpecificInput(@Nullable Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> providerSpecificInput) {
            this.providerSpecificInput = providerSpecificInput;
            return this;
        }

        public Builder providerSpecificInput(@Nullable Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs> providerSpecificInput) {
            this.providerSpecificInput = Output.ofNullable(providerSpecificInput);
            return this;
        }

        public Builder targetProtectionContainerId(@Nullable Output<String> targetProtectionContainerId) {
            this.targetProtectionContainerId = targetProtectionContainerId;
            return this;
        }

        public Builder targetProtectionContainerId(@Nullable String targetProtectionContainerId) {
            this.targetProtectionContainerId = Output.ofNullable(targetProtectionContainerId);
            return this;
        }
        public CreateProtectionContainerMappingInputPropertiesArgs build() {
            return new CreateProtectionContainerMappingInputPropertiesArgs(policyId, providerSpecificInput, targetProtectionContainerId);
        }
    }
}
