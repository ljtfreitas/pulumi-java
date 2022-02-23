// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementGroupPathElementResponse {
    /**
     * The friendly name of the group.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The name of the group.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"displayName","name"})
    private ManagementGroupPathElementResponse(
        @Nullable String displayName,
        @Nullable String name) {
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * The friendly name of the group.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The name of the group.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupPathElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupPathElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ManagementGroupPathElementResponse build() {
            return new ManagementGroupPathElementResponse(displayName, name);
        }
    }
}
