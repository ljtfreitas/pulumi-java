// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTaxonomyResult {
    /**
     * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    private final List<String> activatedPolicyTypes;
    /**
     * Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    private final String description;
    /**
     * User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    private final String displayName;
    /**
     * Resource name of this taxonomy, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{id}".
     * 
     */
    private final String name;
    /**
     * Number of policy tags contained in this taxonomy.
     * 
     */
    private final Integer policyTagCount;
    /**
     * Timestamps about this taxonomy. Only create_time and update_time are used.
     * 
     */
    private final GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps;

    @OutputCustomType.Constructor({"activatedPolicyTypes","description","displayName","name","policyTagCount","taxonomyTimestamps"})
    private GetTaxonomyResult(
        List<String> activatedPolicyTypes,
        String description,
        String displayName,
        String name,
        Integer policyTagCount,
        GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps) {
        this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.policyTagCount = Objects.requireNonNull(policyTagCount);
        this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
    }

    /**
     * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    public List<String> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    /**
     * Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of this taxonomy, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{id}".
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Number of policy tags contained in this taxonomy.
     * 
     */
    public Integer getPolicyTagCount() {
        return this.policyTagCount;
    }
    /**
     * Timestamps about this taxonomy. Only create_time and update_time are used.
     * 
     */
    public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse getTaxonomyTimestamps() {
        return this.taxonomyTimestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> activatedPolicyTypes;
        private String description;
        private String displayName;
        private String name;
        private Integer policyTagCount;
        private GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaxonomyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.policyTagCount = defaults.policyTagCount;
    	      this.taxonomyTimestamps = defaults.taxonomyTimestamps;
        }

        public Builder setActivatedPolicyTypes(List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicyTagCount(Integer policyTagCount) {
            this.policyTagCount = Objects.requireNonNull(policyTagCount);
            return this;
        }

        public Builder setTaxonomyTimestamps(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps) {
            this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
            return this;
        }
        public GetTaxonomyResult build() {
            return new GetTaxonomyResult(activatedPolicyTypes, description, displayName, name, policyTagCount, taxonomyTimestamps);
        }
    }
}
