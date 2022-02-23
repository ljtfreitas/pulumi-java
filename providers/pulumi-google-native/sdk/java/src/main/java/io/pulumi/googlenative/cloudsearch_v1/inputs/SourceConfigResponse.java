// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudsearch_v1.inputs.SourceCrowdingConfigResponse;
import io.pulumi.googlenative.cloudsearch_v1.inputs.SourceResponse;
import io.pulumi.googlenative.cloudsearch_v1.inputs.SourceScoringConfigResponse;
import java.util.Objects;


/**
 * Configurations for a source while processing a Search or Suggest request.
 * 
 */
public final class SourceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceConfigResponse Empty = new SourceConfigResponse();

    /**
     * The crowding configuration for the source.
     * 
     */
    @InputImport(name="crowdingConfig", required=true)
      private final SourceCrowdingConfigResponse crowdingConfig;

    public SourceCrowdingConfigResponse getCrowdingConfig() {
        return this.crowdingConfig;
    }

    /**
     * The scoring configuration for the source.
     * 
     */
    @InputImport(name="scoringConfig", required=true)
      private final SourceScoringConfigResponse scoringConfig;

    public SourceScoringConfigResponse getScoringConfig() {
        return this.scoringConfig;
    }

    /**
     * The source for which this configuration is to be used.
     * 
     */
    @InputImport(name="source", required=true)
      private final SourceResponse source;

    public SourceResponse getSource() {
        return this.source;
    }

    public SourceConfigResponse(
        SourceCrowdingConfigResponse crowdingConfig,
        SourceScoringConfigResponse scoringConfig,
        SourceResponse source) {
        this.crowdingConfig = Objects.requireNonNull(crowdingConfig, "expected parameter 'crowdingConfig' to be non-null");
        this.scoringConfig = Objects.requireNonNull(scoringConfig, "expected parameter 'scoringConfig' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private SourceConfigResponse() {
        this.crowdingConfig = null;
        this.scoringConfig = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceCrowdingConfigResponse crowdingConfig;
        private SourceScoringConfigResponse scoringConfig;
        private SourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crowdingConfig = defaults.crowdingConfig;
    	      this.scoringConfig = defaults.scoringConfig;
    	      this.source = defaults.source;
        }

        public Builder setCrowdingConfig(SourceCrowdingConfigResponse crowdingConfig) {
            this.crowdingConfig = Objects.requireNonNull(crowdingConfig);
            return this;
        }

        public Builder setScoringConfig(SourceScoringConfigResponse scoringConfig) {
            this.scoringConfig = Objects.requireNonNull(scoringConfig);
            return this;
        }

        public Builder setSource(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public SourceConfigResponse build() {
            return new SourceConfigResponse(crowdingConfig, scoringConfig, source);
        }
    }
}
