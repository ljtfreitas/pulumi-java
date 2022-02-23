// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED.
 * 
 */
public final class RollbackConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollbackConfigArgs Empty = new RollbackConfigArgs();

    /**
     * The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    @InputImport(name="revision")
        private final @Nullable Input<Integer> revision;

    public Input<Integer> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    public RollbackConfigArgs(@Nullable Input<Integer> revision) {
        this.revision = revision;
    }

    private RollbackConfigArgs() {
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollbackConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(RollbackConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
        }

        public Builder setRevision(@Nullable Input<Integer> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable Integer revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }
        public RollbackConfigArgs build() {
            return new RollbackConfigArgs(revision);
        }
    }
}
