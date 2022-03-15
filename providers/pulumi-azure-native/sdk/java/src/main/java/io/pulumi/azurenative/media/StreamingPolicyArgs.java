// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.media.inputs.CommonEncryptionCbcsArgs;
import io.pulumi.azurenative.media.inputs.CommonEncryptionCencArgs;
import io.pulumi.azurenative.media.inputs.EnvelopeEncryptionArgs;
import io.pulumi.azurenative.media.inputs.NoEncryptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyArgs Empty = new StreamingPolicyArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Configuration of CommonEncryptionCbcs
     * 
     */
    @Import(name="commonEncryptionCbcs")
      private final @Nullable Output<CommonEncryptionCbcsArgs> commonEncryptionCbcs;

    public Output<CommonEncryptionCbcsArgs> getCommonEncryptionCbcs() {
        return this.commonEncryptionCbcs == null ? Output.empty() : this.commonEncryptionCbcs;
    }

    /**
     * Configuration of CommonEncryptionCenc
     * 
     */
    @Import(name="commonEncryptionCenc")
      private final @Nullable Output<CommonEncryptionCencArgs> commonEncryptionCenc;

    public Output<CommonEncryptionCencArgs> getCommonEncryptionCenc() {
        return this.commonEncryptionCenc == null ? Output.empty() : this.commonEncryptionCenc;
    }

    /**
     * Default ContentKey used by current Streaming Policy
     * 
     */
    @Import(name="defaultContentKeyPolicyName")
      private final @Nullable Output<String> defaultContentKeyPolicyName;

    public Output<String> getDefaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName == null ? Output.empty() : this.defaultContentKeyPolicyName;
    }

    /**
     * Configuration of EnvelopeEncryption
     * 
     */
    @Import(name="envelopeEncryption")
      private final @Nullable Output<EnvelopeEncryptionArgs> envelopeEncryption;

    public Output<EnvelopeEncryptionArgs> getEnvelopeEncryption() {
        return this.envelopeEncryption == null ? Output.empty() : this.envelopeEncryption;
    }

    /**
     * Configurations of NoEncryption
     * 
     */
    @Import(name="noEncryption")
      private final @Nullable Output<NoEncryptionArgs> noEncryption;

    public Output<NoEncryptionArgs> getNoEncryption() {
        return this.noEncryption == null ? Output.empty() : this.noEncryption;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Streaming Policy name.
     * 
     */
    @Import(name="streamingPolicyName")
      private final @Nullable Output<String> streamingPolicyName;

    public Output<String> getStreamingPolicyName() {
        return this.streamingPolicyName == null ? Output.empty() : this.streamingPolicyName;
    }

    public StreamingPolicyArgs(
        Output<String> accountName,
        @Nullable Output<CommonEncryptionCbcsArgs> commonEncryptionCbcs,
        @Nullable Output<CommonEncryptionCencArgs> commonEncryptionCenc,
        @Nullable Output<String> defaultContentKeyPolicyName,
        @Nullable Output<EnvelopeEncryptionArgs> envelopeEncryption,
        @Nullable Output<NoEncryptionArgs> noEncryption,
        Output<String> resourceGroupName,
        @Nullable Output<String> streamingPolicyName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.commonEncryptionCbcs = commonEncryptionCbcs;
        this.commonEncryptionCenc = commonEncryptionCenc;
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        this.envelopeEncryption = envelopeEncryption;
        this.noEncryption = noEncryption;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.streamingPolicyName = streamingPolicyName;
    }

    private StreamingPolicyArgs() {
        this.accountName = Output.empty();
        this.commonEncryptionCbcs = Output.empty();
        this.commonEncryptionCenc = Output.empty();
        this.defaultContentKeyPolicyName = Output.empty();
        this.envelopeEncryption = Output.empty();
        this.noEncryption = Output.empty();
        this.resourceGroupName = Output.empty();
        this.streamingPolicyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<CommonEncryptionCbcsArgs> commonEncryptionCbcs;
        private @Nullable Output<CommonEncryptionCencArgs> commonEncryptionCenc;
        private @Nullable Output<String> defaultContentKeyPolicyName;
        private @Nullable Output<EnvelopeEncryptionArgs> envelopeEncryption;
        private @Nullable Output<NoEncryptionArgs> noEncryption;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.commonEncryptionCbcs = defaults.commonEncryptionCbcs;
    	      this.commonEncryptionCenc = defaults.commonEncryptionCenc;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.envelopeEncryption = defaults.envelopeEncryption;
    	      this.noEncryption = defaults.noEncryption;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder commonEncryptionCbcs(@Nullable Output<CommonEncryptionCbcsArgs> commonEncryptionCbcs) {
            this.commonEncryptionCbcs = commonEncryptionCbcs;
            return this;
        }

        public Builder commonEncryptionCbcs(@Nullable CommonEncryptionCbcsArgs commonEncryptionCbcs) {
            this.commonEncryptionCbcs = Output.ofNullable(commonEncryptionCbcs);
            return this;
        }

        public Builder commonEncryptionCenc(@Nullable Output<CommonEncryptionCencArgs> commonEncryptionCenc) {
            this.commonEncryptionCenc = commonEncryptionCenc;
            return this;
        }

        public Builder commonEncryptionCenc(@Nullable CommonEncryptionCencArgs commonEncryptionCenc) {
            this.commonEncryptionCenc = Output.ofNullable(commonEncryptionCenc);
            return this;
        }

        public Builder defaultContentKeyPolicyName(@Nullable Output<String> defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
            return this;
        }

        public Builder defaultContentKeyPolicyName(@Nullable String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = Output.ofNullable(defaultContentKeyPolicyName);
            return this;
        }

        public Builder envelopeEncryption(@Nullable Output<EnvelopeEncryptionArgs> envelopeEncryption) {
            this.envelopeEncryption = envelopeEncryption;
            return this;
        }

        public Builder envelopeEncryption(@Nullable EnvelopeEncryptionArgs envelopeEncryption) {
            this.envelopeEncryption = Output.ofNullable(envelopeEncryption);
            return this;
        }

        public Builder noEncryption(@Nullable Output<NoEncryptionArgs> noEncryption) {
            this.noEncryption = noEncryption;
            return this;
        }

        public Builder noEncryption(@Nullable NoEncryptionArgs noEncryption) {
            this.noEncryption = Output.ofNullable(noEncryption);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder streamingPolicyName(@Nullable Output<String> streamingPolicyName) {
            this.streamingPolicyName = streamingPolicyName;
            return this;
        }

        public Builder streamingPolicyName(@Nullable String streamingPolicyName) {
            this.streamingPolicyName = Output.ofNullable(streamingPolicyName);
            return this;
        }
        public StreamingPolicyArgs build() {
            return new StreamingPolicyArgs(accountName, commonEncryptionCbcs, commonEncryptionCenc, defaultContentKeyPolicyName, envelopeEncryption, noEncryption, resourceGroupName, streamingPolicyName);
        }
    }
}
