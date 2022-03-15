// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.retail_v2beta.enums.ControlSolutionTypesItem;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaSearchRequestFacetSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlArgs Empty = new ControlArgs();

    @Import(name="catalogId", required=true)
      private final Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId;
    }

    @Import(name="controlId", required=true)
      private final Output<String> controlId;

    public Output<String> getControlId() {
        return this.controlId;
    }

    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * A facet specification to perform faceted search.
     * 
     */
    @Import(name="facetSpec")
      private final @Nullable Output<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec;

    public Output<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> getFacetSpec() {
        return this.facetSpec == null ? Output.empty() : this.facetSpec;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<GoogleCloudRetailV2betaRuleArgs> rule;

    public Output<GoogleCloudRetailV2betaRuleArgs> getRule() {
        return this.rule == null ? Output.empty() : this.rule;
    }

    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    @Import(name="solutionTypes", required=true)
      private final Output<List<ControlSolutionTypesItem>> solutionTypes;

    public Output<List<ControlSolutionTypesItem>> getSolutionTypes() {
        return this.solutionTypes;
    }

    public ControlArgs(
        Output<String> catalogId,
        Output<String> controlId,
        Output<String> displayName,
        @Nullable Output<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudRetailV2betaRuleArgs> rule,
        Output<List<ControlSolutionTypesItem>> solutionTypes) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.controlId = Objects.requireNonNull(controlId, "expected parameter 'controlId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.facetSpec = facetSpec;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rule = rule;
        this.solutionTypes = Objects.requireNonNull(solutionTypes, "expected parameter 'solutionTypes' to be non-null");
    }

    private ControlArgs() {
        this.catalogId = Output.empty();
        this.controlId = Output.empty();
        this.displayName = Output.empty();
        this.facetSpec = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.rule = Output.empty();
        this.solutionTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogId;
        private Output<String> controlId;
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudRetailV2betaRuleArgs> rule;
        private Output<List<ControlSolutionTypesItem>> solutionTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.controlId = defaults.controlId;
    	      this.displayName = defaults.displayName;
    	      this.facetSpec = defaults.facetSpec;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rule = defaults.rule;
    	      this.solutionTypes = defaults.solutionTypes;
        }

        public Builder catalogId(Output<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Output.of(Objects.requireNonNull(catalogId));
            return this;
        }

        public Builder controlId(Output<String> controlId) {
            this.controlId = Objects.requireNonNull(controlId);
            return this;
        }

        public Builder controlId(String controlId) {
            this.controlId = Output.of(Objects.requireNonNull(controlId));
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder facetSpec(@Nullable Output<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec) {
            this.facetSpec = facetSpec;
            return this;
        }

        public Builder facetSpec(@Nullable GoogleCloudRetailV2betaSearchRequestFacetSpecArgs facetSpec) {
            this.facetSpec = Output.ofNullable(facetSpec);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder rule(@Nullable Output<GoogleCloudRetailV2betaRuleArgs> rule) {
            this.rule = rule;
            return this;
        }

        public Builder rule(@Nullable GoogleCloudRetailV2betaRuleArgs rule) {
            this.rule = Output.ofNullable(rule);
            return this;
        }

        public Builder solutionTypes(Output<List<ControlSolutionTypesItem>> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }

        public Builder solutionTypes(List<ControlSolutionTypesItem> solutionTypes) {
            this.solutionTypes = Output.of(Objects.requireNonNull(solutionTypes));
            return this;
        }
        public ControlArgs build() {
            return new ControlArgs(catalogId, controlId, displayName, facetSpec, location, name, project, rule, solutionTypes);
        }
    }
}
