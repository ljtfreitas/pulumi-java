// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.ResourceServerScopeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceServerState extends io.pulumi.resources.ResourceArgs {

    public static final ResourceServerState Empty = new ResourceServerState();

    /**
     * An identifier for the resource server.
     * 
     */
    @InputImport(name="identifier")
    private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * A name for the resource server.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of all scopes configured for this resource server in the format identifier/scope_name.
     * 
     */
    @InputImport(name="scopeIdentifiers")
    private final @Nullable Input<List<String>> scopeIdentifiers;

    public Input<List<String>> getScopeIdentifiers() {
        return this.scopeIdentifiers == null ? Input.empty() : this.scopeIdentifiers;
    }

    /**
     * A list of Authorization Scope.
     * 
     */
    @InputImport(name="scopes")
    private final @Nullable Input<List<ResourceServerScopeGetArgs>> scopes;

    public Input<List<ResourceServerScopeGetArgs>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    @InputImport(name="userPoolId")
    private final @Nullable Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId == null ? Input.empty() : this.userPoolId;
    }

    public ResourceServerState(
        @Nullable Input<String> identifier,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> scopeIdentifiers,
        @Nullable Input<List<ResourceServerScopeGetArgs>> scopes,
        @Nullable Input<String> userPoolId) {
        this.identifier = identifier;
        this.name = name;
        this.scopeIdentifiers = scopeIdentifiers;
        this.scopes = scopes;
        this.userPoolId = userPoolId;
    }

    private ResourceServerState() {
        this.identifier = Input.empty();
        this.name = Input.empty();
        this.scopeIdentifiers = Input.empty();
        this.scopes = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> scopeIdentifiers;
        private @Nullable Input<List<ResourceServerScopeGetArgs>> scopes;
        private @Nullable Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceServerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.scopeIdentifiers = defaults.scopeIdentifiers;
    	      this.scopes = defaults.scopes;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setIdentifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setScopeIdentifiers(@Nullable Input<List<String>> scopeIdentifiers) {
            this.scopeIdentifiers = scopeIdentifiers;
            return this;
        }

        public Builder setScopeIdentifiers(@Nullable List<String> scopeIdentifiers) {
            this.scopeIdentifiers = Input.ofNullable(scopeIdentifiers);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<ResourceServerScopeGetArgs>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<ResourceServerScopeGetArgs> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }

        public Builder setUserPoolId(@Nullable Input<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        public Builder setUserPoolId(@Nullable String userPoolId) {
            this.userPoolId = Input.ofNullable(userPoolId);
            return this;
        }
        public ResourceServerState build() {
            return new ResourceServerState(identifier, name, scopeIdentifiers, scopes, userPoolId);
        }
    }
}