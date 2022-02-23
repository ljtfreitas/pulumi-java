// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.IndexOrder;
import io.pulumi.awsnative.kendra.outputs.IndexValueImportanceItem;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IndexRelevance {
    private final @Nullable String duration;
    private final @Nullable Boolean freshness;
    private final @Nullable Integer importance;
    private final @Nullable IndexOrder rankOrder;
    private final @Nullable List<IndexValueImportanceItem> valueImportanceItems;

    @OutputCustomType.Constructor({"duration","freshness","importance","rankOrder","valueImportanceItems"})
    private IndexRelevance(
        @Nullable String duration,
        @Nullable Boolean freshness,
        @Nullable Integer importance,
        @Nullable IndexOrder rankOrder,
        @Nullable List<IndexValueImportanceItem> valueImportanceItems) {
        this.duration = duration;
        this.freshness = freshness;
        this.importance = importance;
        this.rankOrder = rankOrder;
        this.valueImportanceItems = valueImportanceItems;
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<Boolean> getFreshness() {
        return Optional.ofNullable(this.freshness);
    }
    public Optional<Integer> getImportance() {
        return Optional.ofNullable(this.importance);
    }
    public Optional<IndexOrder> getRankOrder() {
        return Optional.ofNullable(this.rankOrder);
    }
    public List<IndexValueImportanceItem> getValueImportanceItems() {
        return this.valueImportanceItems == null ? List.of() : this.valueImportanceItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexRelevance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String duration;
        private @Nullable Boolean freshness;
        private @Nullable Integer importance;
        private @Nullable IndexOrder rankOrder;
        private @Nullable List<IndexValueImportanceItem> valueImportanceItems;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexRelevance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.freshness = defaults.freshness;
    	      this.importance = defaults.importance;
    	      this.rankOrder = defaults.rankOrder;
    	      this.valueImportanceItems = defaults.valueImportanceItems;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setFreshness(@Nullable Boolean freshness) {
            this.freshness = freshness;
            return this;
        }

        public Builder setImportance(@Nullable Integer importance) {
            this.importance = importance;
            return this;
        }

        public Builder setRankOrder(@Nullable IndexOrder rankOrder) {
            this.rankOrder = rankOrder;
            return this;
        }

        public Builder setValueImportanceItems(@Nullable List<IndexValueImportanceItem> valueImportanceItems) {
            this.valueImportanceItems = valueImportanceItems;
            return this;
        }
        public IndexRelevance build() {
            return new IndexRelevance(duration, freshness, importance, rankOrder, valueImportanceItems);
        }
    }
}
