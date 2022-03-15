// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsArgs Empty = new AccessLevelsArgs();

    /**
     * The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    @Import(name="accessLevels")
      private final @Nullable Output<List<AccessLevelsAccessLevelArgs>> accessLevels;

    public Output<List<AccessLevelsAccessLevelArgs>> getAccessLevels() {
        return this.accessLevels == null ? Output.empty() : this.accessLevels;
    }

    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    public AccessLevelsArgs(
        @Nullable Output<List<AccessLevelsAccessLevelArgs>> accessLevels,
        Output<String> parent) {
        this.accessLevels = accessLevels;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private AccessLevelsArgs() {
        this.accessLevels = Output.empty();
        this.parent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AccessLevelsAccessLevelArgs>> accessLevels;
        private Output<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.parent = defaults.parent;
        }

        public Builder accessLevels(@Nullable Output<List<AccessLevelsAccessLevelArgs>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder accessLevels(@Nullable List<AccessLevelsAccessLevelArgs> accessLevels) {
            this.accessLevels = Output.ofNullable(accessLevels);
            return this;
        }

        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public AccessLevelsArgs build() {
            return new AccessLevelsArgs(accessLevels, parent);
        }
    }
}
