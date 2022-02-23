// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.route53recoveryreadiness.inputs.RecoveryGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecoveryGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecoveryGroupArgs Empty = new RecoveryGroupArgs();

    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    @InputImport(name="cells")
        private final @Nullable Input<List<String>> cells;

    public Input<List<String>> getCells() {
        return this.cells == null ? Input.empty() : this.cells;
    }

    /**
     * The name of the recovery group to create.
     * 
     */
    @InputImport(name="recoveryGroupName")
        private final @Nullable Input<String> recoveryGroupName;

    public Input<String> getRecoveryGroupName() {
        return this.recoveryGroupName == null ? Input.empty() : this.recoveryGroupName;
    }

    /**
     * A collection of tags associated with a resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<RecoveryGroupTagArgs>> tags;

    public Input<List<RecoveryGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RecoveryGroupArgs(
        @Nullable Input<List<String>> cells,
        @Nullable Input<String> recoveryGroupName,
        @Nullable Input<List<RecoveryGroupTagArgs>> tags) {
        this.cells = cells;
        this.recoveryGroupName = recoveryGroupName;
        this.tags = tags;
    }

    private RecoveryGroupArgs() {
        this.cells = Input.empty();
        this.recoveryGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cells;
        private @Nullable Input<String> recoveryGroupName;
        private @Nullable Input<List<RecoveryGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.recoveryGroupName = defaults.recoveryGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setCells(@Nullable Input<List<String>> cells) {
            this.cells = cells;
            return this;
        }

        public Builder setCells(@Nullable List<String> cells) {
            this.cells = Input.ofNullable(cells);
            return this;
        }

        public Builder setRecoveryGroupName(@Nullable Input<String> recoveryGroupName) {
            this.recoveryGroupName = recoveryGroupName;
            return this;
        }

        public Builder setRecoveryGroupName(@Nullable String recoveryGroupName) {
            this.recoveryGroupName = Input.ofNullable(recoveryGroupName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<RecoveryGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RecoveryGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RecoveryGroupArgs build() {
            return new RecoveryGroupArgs(cells, recoveryGroupName, tags);
        }
    }
}
