// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListNotebookProxyCredentialsResult {
    /**
     * Hostname for the Notebook Proxy resource
     * 
     */
    private final @Nullable String hostname;
    /**
     * The primary key of the NotebookProxy resource.
     * 
     */
    private final @Nullable String primaryAccessKey;
    /**
     * Notebook Proxy resource id
     * 
     */
    private final @Nullable String resourceId;
    /**
     * The secondary key of the NotebookProxy resource.
     * 
     */
    private final @Nullable String secondaryAccessKey;

    @OutputCustomType.Constructor({"hostname","primaryAccessKey","resourceId","secondaryAccessKey"})
    private ListNotebookProxyCredentialsResult(
        @Nullable String hostname,
        @Nullable String primaryAccessKey,
        @Nullable String resourceId,
        @Nullable String secondaryAccessKey) {
        this.hostname = hostname;
        this.primaryAccessKey = primaryAccessKey;
        this.resourceId = resourceId;
        this.secondaryAccessKey = secondaryAccessKey;
    }

    /**
     * Hostname for the Notebook Proxy resource
     * 
     */
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * The primary key of the NotebookProxy resource.
     * 
     */
    public Optional<String> getPrimaryAccessKey() {
        return Optional.ofNullable(this.primaryAccessKey);
    }
    /**
     * Notebook Proxy resource id
     * 
     */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * The secondary key of the NotebookProxy resource.
     * 
     */
    public Optional<String> getSecondaryAccessKey() {
        return Optional.ofNullable(this.secondaryAccessKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNotebookProxyCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String primaryAccessKey;
        private @Nullable String resourceId;
        private @Nullable String secondaryAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNotebookProxyCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.primaryAccessKey = defaults.primaryAccessKey;
    	      this.resourceId = defaults.resourceId;
    	      this.secondaryAccessKey = defaults.secondaryAccessKey;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setPrimaryAccessKey(@Nullable String primaryAccessKey) {
            this.primaryAccessKey = primaryAccessKey;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setSecondaryAccessKey(@Nullable String secondaryAccessKey) {
            this.secondaryAccessKey = secondaryAccessKey;
            return this;
        }

        public ListNotebookProxyCredentialsResult build() {
            return new ListNotebookProxyCredentialsResult(hostname, primaryAccessKey, resourceId, secondaryAccessKey);
        }
    }
}
