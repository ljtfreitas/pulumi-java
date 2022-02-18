// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.ClientGroupInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KafkaRestPropertiesResponse {
    /**
     * The information of AAD security group.
     * 
     */
    private final @Nullable ClientGroupInfoResponse clientGroupInfo;
    /**
     * The configurations that need to be overriden.
     * 
     */
    private final @Nullable Map<String,String> configurationOverride;

    @OutputCustomType.Constructor({"clientGroupInfo","configurationOverride"})
    private KafkaRestPropertiesResponse(
        @Nullable ClientGroupInfoResponse clientGroupInfo,
        @Nullable Map<String,String> configurationOverride) {
        this.clientGroupInfo = clientGroupInfo;
        this.configurationOverride = configurationOverride;
    }

    /**
     * The information of AAD security group.
     * 
     */
    public Optional<ClientGroupInfoResponse> getClientGroupInfo() {
        return Optional.ofNullable(this.clientGroupInfo);
    }
    /**
     * The configurations that need to be overriden.
     * 
     */
    public Map<String,String> getConfigurationOverride() {
        return this.configurationOverride == null ? Map.of() : this.configurationOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaRestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClientGroupInfoResponse clientGroupInfo;
        private @Nullable Map<String,String> configurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaRestPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientGroupInfo = defaults.clientGroupInfo;
    	      this.configurationOverride = defaults.configurationOverride;
        }

        public Builder setClientGroupInfo(@Nullable ClientGroupInfoResponse clientGroupInfo) {
            this.clientGroupInfo = clientGroupInfo;
            return this;
        }

        public Builder setConfigurationOverride(@Nullable Map<String,String> configurationOverride) {
            this.configurationOverride = configurationOverride;
            return this;
        }

        public KafkaRestPropertiesResponse build() {
            return new KafkaRestPropertiesResponse(clientGroupInfo, configurationOverride);
        }
    }
}
