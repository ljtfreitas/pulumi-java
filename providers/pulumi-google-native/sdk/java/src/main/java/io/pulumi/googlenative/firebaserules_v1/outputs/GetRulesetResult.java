// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.firebaserules_v1.outputs.MetadataResponse;
import io.pulumi.googlenative.firebaserules_v1.outputs.SourceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesetResult {
    /**
     * Time the `Ruleset` was created.
     * 
     */
    private final String createTime;
    /**
     * The metadata for this ruleset.
     * 
     */
    private final MetadataResponse metadata;
    /**
     * Name of the `Ruleset`. The ruleset_id is auto generated by the service. Format: `projects/{project_id}/rulesets/{ruleset_id}`
     * 
     */
    private final String name;
    /**
     * `Source` for the `Ruleset`.
     * 
     */
    private final SourceResponse source;

    @CustomType.Constructor
    private GetRulesetResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("metadata") MetadataResponse metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("source") SourceResponse source) {
        this.createTime = createTime;
        this.metadata = metadata;
        this.name = name;
        this.source = source;
    }

    /**
     * Time the `Ruleset` was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The metadata for this ruleset.
     * 
    */
    public MetadataResponse getMetadata() {
        return this.metadata;
    }
    /**
     * Name of the `Ruleset`. The ruleset_id is auto generated by the service. Format: `projects/{project_id}/rulesets/{ruleset_id}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * `Source` for the `Ruleset`.
     * 
    */
    public SourceResponse getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private MetadataResponse metadata;
        private String name;
        private SourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder metadata(MetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder source(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public GetRulesetResult build() {
            return new GetRulesetResult(createTime, metadata, name, source);
        }
    }
}
