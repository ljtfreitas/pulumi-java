// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWorkspaceKeysResult {
    /**
     * Primary authorization key for this workspace.
     * 
     */
    private final @Nullable String primaryToken;
    /**
     * Secondary authorization key for this workspace.
     * 
     */
    private final @Nullable String secondaryToken;

    @OutputCustomType.Constructor({"primaryToken","secondaryToken"})
    private ListWorkspaceKeysResult(
        @Nullable String primaryToken,
        @Nullable String secondaryToken) {
        this.primaryToken = primaryToken;
        this.secondaryToken = secondaryToken;
    }

    /**
     * Primary authorization key for this workspace.
     * 
     */
    public Optional<String> getPrimaryToken() {
        return Optional.ofNullable(this.primaryToken);
    }
    /**
     * Secondary authorization key for this workspace.
     * 
     */
    public Optional<String> getSecondaryToken() {
        return Optional.ofNullable(this.secondaryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkspaceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryToken;
        private @Nullable String secondaryToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkspaceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryToken = defaults.primaryToken;
    	      this.secondaryToken = defaults.secondaryToken;
        }

        public Builder setPrimaryToken(@Nullable String primaryToken) {
            this.primaryToken = primaryToken;
            return this;
        }

        public Builder setSecondaryToken(@Nullable String secondaryToken) {
            this.secondaryToken = secondaryToken;
            return this;
        }

        public ListWorkspaceKeysResult build() {
            return new ListWorkspaceKeysResult(primaryToken, secondaryToken);
        }
    }
}
