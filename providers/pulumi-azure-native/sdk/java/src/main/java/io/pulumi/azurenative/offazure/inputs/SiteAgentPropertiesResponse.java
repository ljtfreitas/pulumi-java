// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class for site agent properties.
 * 
 */
public final class SiteAgentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SiteAgentPropertiesResponse Empty = new SiteAgentPropertiesResponse();

    /**
     * ID of the agent.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Key vault ARM Id.
     * 
     */
    @InputImport(name="keyVaultId")
    private final @Nullable String keyVaultId;

    public Optional<String> getKeyVaultId() {
        return this.keyVaultId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultId);
    }

    /**
     * Key vault URI.
     * 
     */
    @InputImport(name="keyVaultUri")
    private final @Nullable String keyVaultUri;

    public Optional<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Optional.empty() : Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * Last heartbeat time of the agent in UTC.
     * 
     */
    @InputImport(name="lastHeartBeatUtc", required=true)
    private final String lastHeartBeatUtc;

    public String getLastHeartBeatUtc() {
        return this.lastHeartBeatUtc;
    }

    /**
     * Version of the agent.
     * 
     */
    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public SiteAgentPropertiesResponse(
        String id,
        @Nullable String keyVaultId,
        @Nullable String keyVaultUri,
        String lastHeartBeatUtc,
        String version) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
        this.lastHeartBeatUtc = Objects.requireNonNull(lastHeartBeatUtc, "expected parameter 'lastHeartBeatUtc' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SiteAgentPropertiesResponse() {
        this.id = null;
        this.keyVaultId = null;
        this.keyVaultUri = null;
        this.lastHeartBeatUtc = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteAgentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultUri;
        private String lastHeartBeatUtc;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteAgentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.lastHeartBeatUtc = defaults.lastHeartBeatUtc;
    	      this.version = defaults.version;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setLastHeartBeatUtc(String lastHeartBeatUtc) {
            this.lastHeartBeatUtc = Objects.requireNonNull(lastHeartBeatUtc);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public SiteAgentPropertiesResponse build() {
            return new SiteAgentPropertiesResponse(id, keyVaultId, keyVaultUri, lastHeartBeatUtc, version);
        }
    }
}
