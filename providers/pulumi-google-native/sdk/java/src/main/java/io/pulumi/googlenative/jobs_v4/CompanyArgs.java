// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.jobs_v4.enums.CompanySize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompanyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompanyArgs Empty = new CompanyArgs();

    /**
     * The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    @Import(name="careerSiteUri")
      private final @Nullable Output<String> careerSiteUri;

    public Output<String> getCareerSiteUri() {
        return this.careerSiteUri == null ? Output.empty() : this.careerSiteUri;
    }

    /**
     * The display name of the company, for example, "Google LLC".
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    @Import(name="eeoText")
      private final @Nullable Output<String> eeoText;

    public Output<String> getEeoText() {
        return this.eeoText == null ? Output.empty() : this.eeoText;
    }

    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    @Import(name="externalId", required=true)
      private final Output<String> externalId;

    public Output<String> getExternalId() {
        return this.externalId;
    }

    /**
     * The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    @Import(name="headquartersAddress")
      private final @Nullable Output<String> headquartersAddress;

    public Output<String> getHeadquartersAddress() {
        return this.headquartersAddress == null ? Output.empty() : this.headquartersAddress;
    }

    /**
     * Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    @Import(name="hiringAgency")
      private final @Nullable Output<Boolean> hiringAgency;

    public Output<Boolean> getHiringAgency() {
        return this.hiringAgency == null ? Output.empty() : this.hiringAgency;
    }

    /**
     * A URI that hosts the employer's company logo.
     * 
     */
    @Import(name="imageUri")
      private final @Nullable Output<String> imageUri;

    public Output<String> getImageUri() {
        return this.imageUri == null ? Output.empty() : this.imageUri;
    }

    /**
     * A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
     * 
     */
    @Import(name="keywordSearchableJobCustomAttributes")
      private final @Nullable Output<List<String>> keywordSearchableJobCustomAttributes;

    public Output<List<String>> getKeywordSearchableJobCustomAttributes() {
        return this.keywordSearchableJobCustomAttributes == null ? Output.empty() : this.keywordSearchableJobCustomAttributes;
    }

    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for example, "projects/foo/tenants/bar/companies/baz".
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
     * The employer's company size.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<CompanySize> size;

    public Output<CompanySize> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    @Import(name="tenantId", required=true)
      private final Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId;
    }

    /**
     * The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    @Import(name="websiteUri")
      private final @Nullable Output<String> websiteUri;

    public Output<String> getWebsiteUri() {
        return this.websiteUri == null ? Output.empty() : this.websiteUri;
    }

    public CompanyArgs(
        @Nullable Output<String> careerSiteUri,
        Output<String> displayName,
        @Nullable Output<String> eeoText,
        Output<String> externalId,
        @Nullable Output<String> headquartersAddress,
        @Nullable Output<Boolean> hiringAgency,
        @Nullable Output<String> imageUri,
        @Nullable Output<List<String>> keywordSearchableJobCustomAttributes,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<CompanySize> size,
        Output<String> tenantId,
        @Nullable Output<String> websiteUri) {
        this.careerSiteUri = careerSiteUri;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.eeoText = eeoText;
        this.externalId = Objects.requireNonNull(externalId, "expected parameter 'externalId' to be non-null");
        this.headquartersAddress = headquartersAddress;
        this.hiringAgency = hiringAgency;
        this.imageUri = imageUri;
        this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
        this.name = name;
        this.project = project;
        this.size = size;
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.websiteUri = websiteUri;
    }

    private CompanyArgs() {
        this.careerSiteUri = Output.empty();
        this.displayName = Output.empty();
        this.eeoText = Output.empty();
        this.externalId = Output.empty();
        this.headquartersAddress = Output.empty();
        this.hiringAgency = Output.empty();
        this.imageUri = Output.empty();
        this.keywordSearchableJobCustomAttributes = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.size = Output.empty();
        this.tenantId = Output.empty();
        this.websiteUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompanyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> careerSiteUri;
        private Output<String> displayName;
        private @Nullable Output<String> eeoText;
        private Output<String> externalId;
        private @Nullable Output<String> headquartersAddress;
        private @Nullable Output<Boolean> hiringAgency;
        private @Nullable Output<String> imageUri;
        private @Nullable Output<List<String>> keywordSearchableJobCustomAttributes;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<CompanySize> size;
        private Output<String> tenantId;
        private @Nullable Output<String> websiteUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CompanyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.careerSiteUri = defaults.careerSiteUri;
    	      this.displayName = defaults.displayName;
    	      this.eeoText = defaults.eeoText;
    	      this.externalId = defaults.externalId;
    	      this.headquartersAddress = defaults.headquartersAddress;
    	      this.hiringAgency = defaults.hiringAgency;
    	      this.imageUri = defaults.imageUri;
    	      this.keywordSearchableJobCustomAttributes = defaults.keywordSearchableJobCustomAttributes;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.size = defaults.size;
    	      this.tenantId = defaults.tenantId;
    	      this.websiteUri = defaults.websiteUri;
        }

        public Builder careerSiteUri(@Nullable Output<String> careerSiteUri) {
            this.careerSiteUri = careerSiteUri;
            return this;
        }

        public Builder careerSiteUri(@Nullable String careerSiteUri) {
            this.careerSiteUri = Output.ofNullable(careerSiteUri);
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

        public Builder eeoText(@Nullable Output<String> eeoText) {
            this.eeoText = eeoText;
            return this;
        }

        public Builder eeoText(@Nullable String eeoText) {
            this.eeoText = Output.ofNullable(eeoText);
            return this;
        }

        public Builder externalId(Output<String> externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }

        public Builder externalId(String externalId) {
            this.externalId = Output.of(Objects.requireNonNull(externalId));
            return this;
        }

        public Builder headquartersAddress(@Nullable Output<String> headquartersAddress) {
            this.headquartersAddress = headquartersAddress;
            return this;
        }

        public Builder headquartersAddress(@Nullable String headquartersAddress) {
            this.headquartersAddress = Output.ofNullable(headquartersAddress);
            return this;
        }

        public Builder hiringAgency(@Nullable Output<Boolean> hiringAgency) {
            this.hiringAgency = hiringAgency;
            return this;
        }

        public Builder hiringAgency(@Nullable Boolean hiringAgency) {
            this.hiringAgency = Output.ofNullable(hiringAgency);
            return this;
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = Output.ofNullable(imageUri);
            return this;
        }

        public Builder keywordSearchableJobCustomAttributes(@Nullable Output<List<String>> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
            return this;
        }

        public Builder keywordSearchableJobCustomAttributes(@Nullable List<String> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = Output.ofNullable(keywordSearchableJobCustomAttributes);
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

        public Builder size(@Nullable Output<CompanySize> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable CompanySize size) {
            this.size = Output.ofNullable(size);
            return this;
        }

        public Builder tenantId(Output<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Output.of(Objects.requireNonNull(tenantId));
            return this;
        }

        public Builder websiteUri(@Nullable Output<String> websiteUri) {
            this.websiteUri = websiteUri;
            return this;
        }

        public Builder websiteUri(@Nullable String websiteUri) {
            this.websiteUri = Output.ofNullable(websiteUri);
            return this;
        }
        public CompanyArgs build() {
            return new CompanyArgs(careerSiteUri, displayName, eeoText, externalId, headquartersAddress, hiringAgency, imageUri, keywordSearchableJobCustomAttributes, name, project, size, tenantId, websiteUri);
        }
    }
}
