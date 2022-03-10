// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketTagFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketMetricsConfiguration {
    private final @Nullable String accessPointArn;
    private final String id;
    private final @Nullable String prefix;
    private final @Nullable List<BucketTagFilter> tagFilters;

    @OutputCustomType.Constructor
    private BucketMetricsConfiguration(
        @OutputCustomType.Parameter("accessPointArn") @Nullable String accessPointArn,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("prefix") @Nullable String prefix,
        @OutputCustomType.Parameter("tagFilters") @Nullable List<BucketTagFilter> tagFilters) {
        this.accessPointArn = accessPointArn;
        this.id = id;
        this.prefix = prefix;
        this.tagFilters = tagFilters;
    }

    public Optional<String> getAccessPointArn() {
        return Optional.ofNullable(this.accessPointArn);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    public List<BucketTagFilter> getTagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPointArn;
        private String id;
        private @Nullable String prefix;
        private @Nullable List<BucketTagFilter> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointArn = defaults.accessPointArn;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder setAccessPointArn(@Nullable String accessPointArn) {
            this.accessPointArn = accessPointArn;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setTagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public BucketMetricsConfiguration build() {
            return new BucketMetricsConfiguration(accessPointArn, id, prefix, tagFilters);
        }
    }
}
