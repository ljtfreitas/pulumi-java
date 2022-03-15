// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterGetArgs;
import io.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationState Empty = new AnalyticsConfigurationState();

    /**
     * The name of the bucket this analytics configuration is associated with.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<AnalyticsConfigurationFilterGetArgs> filter;

    public Output<AnalyticsConfigurationFilterGetArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * Unique identifier of the analytics configuration for the bucket.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration for the analytics data export (documented below).
     * 
     */
    @Import(name="storageClassAnalysis")
      private final @Nullable Output<AnalyticsConfigurationStorageClassAnalysisGetArgs> storageClassAnalysis;

    public Output<AnalyticsConfigurationStorageClassAnalysisGetArgs> getStorageClassAnalysis() {
        return this.storageClassAnalysis == null ? Output.empty() : this.storageClassAnalysis;
    }

    public AnalyticsConfigurationState(
        @Nullable Output<String> bucket,
        @Nullable Output<AnalyticsConfigurationFilterGetArgs> filter,
        @Nullable Output<String> name,
        @Nullable Output<AnalyticsConfigurationStorageClassAnalysisGetArgs> storageClassAnalysis) {
        this.bucket = bucket;
        this.filter = filter;
        this.name = name;
        this.storageClassAnalysis = storageClassAnalysis;
    }

    private AnalyticsConfigurationState() {
        this.bucket = Output.empty();
        this.filter = Output.empty();
        this.name = Output.empty();
        this.storageClassAnalysis = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<AnalyticsConfigurationFilterGetArgs> filter;
        private @Nullable Output<String> name;
        private @Nullable Output<AnalyticsConfigurationStorageClassAnalysisGetArgs> storageClassAnalysis;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.storageClassAnalysis = defaults.storageClassAnalysis;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }

        public Builder filter(@Nullable Output<AnalyticsConfigurationFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable AnalyticsConfigurationFilterGetArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder storageClassAnalysis(@Nullable Output<AnalyticsConfigurationStorageClassAnalysisGetArgs> storageClassAnalysis) {
            this.storageClassAnalysis = storageClassAnalysis;
            return this;
        }

        public Builder storageClassAnalysis(@Nullable AnalyticsConfigurationStorageClassAnalysisGetArgs storageClassAnalysis) {
            this.storageClassAnalysis = Output.ofNullable(storageClassAnalysis);
            return this;
        }
        public AnalyticsConfigurationState build() {
            return new AnalyticsConfigurationState(bucket, filter, name, storageClassAnalysis);
        }
    }
}
