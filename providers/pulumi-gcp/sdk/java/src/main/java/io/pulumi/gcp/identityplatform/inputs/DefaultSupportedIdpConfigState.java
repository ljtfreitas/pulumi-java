// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSupportedIdpConfigState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSupportedIdpConfigState Empty = new DefaultSupportedIdpConfigState();

    /**
     * OAuth client ID
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * OAuth client secret
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret == null ? Codegen.empty() : this.clientSecret;
    }

    /**
     * If this IDP allows the user to sign in
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * ID of the IDP. Possible values include:
     * * `apple.com`
     * * `facebook.com`
     * * `gc.apple.com`
     * * `github.com`
     * * `google.com`
     * * `linkedin.com`
     * * `microsoft.com`
     * * `playgames.google.com`
     * * `twitter.com`
     * * `yahoo.com`
     * 
     */
    @Import(name="idpId")
      private final @Nullable Output<String> idpId;

    public Output<String> idpId() {
        return this.idpId == null ? Codegen.empty() : this.idpId;
    }

    /**
     * The name of the DefaultSupportedIdpConfig resource
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public DefaultSupportedIdpConfigState(
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecret,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> idpId,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.enabled = enabled;
        this.idpId = idpId;
        this.name = name;
        this.project = project;
    }

    private DefaultSupportedIdpConfigState() {
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.enabled = Codegen.empty();
        this.idpId = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSupportedIdpConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecret;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> idpId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSupportedIdpConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.enabled = defaults.enabled;
    	      this.idpId = defaults.idpId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Codegen.ofNullable(clientSecret);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder idpId(@Nullable Output<String> idpId) {
            this.idpId = idpId;
            return this;
        }
        public Builder idpId(@Nullable String idpId) {
            this.idpId = Codegen.ofNullable(idpId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public DefaultSupportedIdpConfigState build() {
            return new DefaultSupportedIdpConfigState(clientId, clientSecret, enabled, idpId, name, project);
        }
    }
}
