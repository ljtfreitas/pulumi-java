// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class for site agent properties.
 * 
 */
public final class SiteAgentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteAgentPropertiesArgs Empty = new SiteAgentPropertiesArgs();

    /**
     * Key vault ARM Id.
     * 
     */
    @InputImport(name="keyVaultId")
    private final @Nullable Input<String> keyVaultId;

    public Input<String> getKeyVaultId() {
        return this.keyVaultId == null ? Input.empty() : this.keyVaultId;
    }

    /**
     * Key vault URI.
     * 
     */
    @InputImport(name="keyVaultUri")
    private final @Nullable Input<String> keyVaultUri;

    public Input<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Input.empty() : this.keyVaultUri;
    }

    public SiteAgentPropertiesArgs(
        @Nullable Input<String> keyVaultId,
        @Nullable Input<String> keyVaultUri) {
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
    }

    private SiteAgentPropertiesArgs() {
        this.keyVaultId = Input.empty();
        this.keyVaultUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteAgentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyVaultId;
        private @Nullable Input<String> keyVaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteAgentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
        }

        public Builder setKeyVaultId(@Nullable Input<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Input.ofNullable(keyVaultId);
            return this;
        }

        public Builder setKeyVaultUri(@Nullable Input<String> keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = Input.ofNullable(keyVaultUri);
            return this;
        }

        public SiteAgentPropertiesArgs build() {
            return new SiteAgentPropertiesArgs(keyVaultId, keyVaultUri);
        }
    }
}
