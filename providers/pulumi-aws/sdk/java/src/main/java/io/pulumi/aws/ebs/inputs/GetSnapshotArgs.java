// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.aws.ebs.inputs.GetSnapshotFilter;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-snapshots in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetSnapshotFilter> filters;

    public List<GetSnapshotFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * If more than one result is returned, use the most recent snapshot.
     * 
     */
    @Import(name="mostRecent")
      private final @Nullable Boolean mostRecent;

    public Optional<Boolean> getMostRecent() {
        return this.mostRecent == null ? Optional.empty() : Optional.ofNullable(this.mostRecent);
    }

    /**
     * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
     * 
     */
    @Import(name="owners")
      private final @Nullable List<String> owners;

    public List<String> getOwners() {
        return this.owners == null ? List.of() : this.owners;
    }

    /**
     * One or more AWS accounts IDs that can create volumes from the snapshot.
     * 
     */
    @Import(name="restorableByUserIds")
      private final @Nullable List<String> restorableByUserIds;

    public List<String> getRestorableByUserIds() {
        return this.restorableByUserIds == null ? List.of() : this.restorableByUserIds;
    }

    /**
     * Returns information on a specific snapshot_id.
     * 
     */
    @Import(name="snapshotIds")
      private final @Nullable List<String> snapshotIds;

    public List<String> getSnapshotIds() {
        return this.snapshotIds == null ? List.of() : this.snapshotIds;
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetSnapshotArgs(
        @Nullable List<GetSnapshotFilter> filters,
        @Nullable Boolean mostRecent,
        @Nullable List<String> owners,
        @Nullable List<String> restorableByUserIds,
        @Nullable List<String> snapshotIds,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.mostRecent = mostRecent;
        this.owners = owners;
        this.restorableByUserIds = restorableByUserIds;
        this.snapshotIds = snapshotIds;
        this.tags = tags;
    }

    private GetSnapshotArgs() {
        this.filters = List.of();
        this.mostRecent = null;
        this.owners = List.of();
        this.restorableByUserIds = List.of();
        this.snapshotIds = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSnapshotFilter> filters;
        private @Nullable Boolean mostRecent;
        private @Nullable List<String> owners;
        private @Nullable List<String> restorableByUserIds;
        private @Nullable List<String> snapshotIds;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.mostRecent = defaults.mostRecent;
    	      this.owners = defaults.owners;
    	      this.restorableByUserIds = defaults.restorableByUserIds;
    	      this.snapshotIds = defaults.snapshotIds;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetSnapshotFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder owners(@Nullable List<String> owners) {
            this.owners = owners;
            return this;
        }

        public Builder restorableByUserIds(@Nullable List<String> restorableByUserIds) {
            this.restorableByUserIds = restorableByUserIds;
            return this;
        }

        public Builder snapshotIds(@Nullable List<String> snapshotIds) {
            this.snapshotIds = snapshotIds;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetSnapshotArgs build() {
            return new GetSnapshotArgs(filters, mostRecent, owners, restorableByUserIds, snapshotIds, tags);
        }
    }
}
