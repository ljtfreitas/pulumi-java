// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.jobs_v3.enums.JobDegreeTypesItem;
import io.pulumi.googlenative.jobs_v3.enums.JobEmploymentTypesItem;
import io.pulumi.googlenative.jobs_v3.enums.JobJobBenefitsItem;
import io.pulumi.googlenative.jobs_v3.enums.JobJobLevel;
import io.pulumi.googlenative.jobs_v3.enums.JobPostingRegion;
import io.pulumi.googlenative.jobs_v3.inputs.ApplicationInfoArgs;
import io.pulumi.googlenative.jobs_v3.inputs.CompensationInfoArgs;
import io.pulumi.googlenative.jobs_v3.inputs.ProcessingOptionsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * Optional but strongly recommended for the best service experience. Location(s) where the employer is looking to hire for this job posting. Specifying the full street address(es) of the hiring location enables better API results, especially job searches by commute time. At most 50 locations are allowed for best search performance. If a job has more locations, it is suggested to split it into multiple jobs with unique requisition_ids (e.g. 'ReqA' becomes 'ReqA-1', 'ReqA-2', etc.) as multiple jobs with the same company_name, language_code and requisition_id are not allowed. If the original requisition_id must be preserved, a custom field should be used for storage. It is also suggested to group the locations that close to each other in the same job for better search experience. Jobs with multiple addresses must have their addresses with the same LocationType to allow location filtering to work properly. (For example, a Job with addresses "1600 Amphitheatre Parkway, Mountain View, CA, USA" and "London, UK" may not have location filters applied correctly at search time since the first is a LocationType.STREET_ADDRESS and the second is a LocationType.LOCALITY.) If a job needs to have multiple addresses, it is suggested to split it into multiple jobs with same LocationTypes. The maximum number of allowed characters is 500.
     * 
     */
    @InputImport(name="addresses")
      private final @Nullable Input<List<String>> addresses;

    public Input<List<String>> getAddresses() {
        return this.addresses == null ? Input.empty() : this.addresses;
    }

    /**
     * At least one field within ApplicationInfo must be specified. Job application information.
     * 
     */
    @InputImport(name="applicationInfo", required=true)
      private final Input<ApplicationInfoArgs> applicationInfo;

    public Input<ApplicationInfoArgs> getApplicationInfo() {
        return this.applicationInfo;
    }

    /**
     * The resource name of the company listing the job, such as "projects/api-test-project/companies/foo".
     * 
     */
    @InputImport(name="companyName", required=true)
      private final Input<String> companyName;

    public Input<String> getCompanyName() {
        return this.companyName;
    }

    /**
     * Optional. Job compensation information.
     * 
     */
    @InputImport(name="compensationInfo")
      private final @Nullable Input<CompensationInfoArgs> compensationInfo;

    public Input<CompensationInfoArgs> getCompensationInfo() {
        return this.compensationInfo == null ? Input.empty() : this.compensationInfo;
    }

    /**
     * Optional. A map of fields to hold both filterable and non-filterable custom job attributes that are not covered by the provided structured fields. The keys of the map are strings up to 64 bytes and must match the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS. At most 100 filterable and at most 100 unfilterable keys are supported. For filterable `string_values`, across all keys at most 200 values are allowed, with each string no more than 255 characters. For unfilterable `string_values`, the maximum total size of `string_values` across all keys is 50KB.
     * 
     */
    @InputImport(name="customAttributes")
      private final @Nullable Input<Map<String,String>> customAttributes;

    public Input<Map<String,String>> getCustomAttributes() {
        return this.customAttributes == null ? Input.empty() : this.customAttributes;
    }

    /**
     * Optional. The desired education degrees for the job, such as Bachelors, Masters.
     * 
     */
    @InputImport(name="degreeTypes")
      private final @Nullable Input<List<JobDegreeTypesItem>> degreeTypes;

    public Input<List<JobDegreeTypesItem>> getDegreeTypes() {
        return this.degreeTypes == null ? Input.empty() : this.degreeTypes;
    }

    /**
     * Optional. The department or functional area within the company with the open position. The maximum number of allowed characters is 255.
     * 
     */
    @InputImport(name="department")
      private final @Nullable Input<String> department;

    public Input<String> getDepartment() {
        return this.department == null ? Input.empty() : this.department;
    }

    /**
     * The description of the job, which typically includes a multi-paragraph description of the company and related information. Separate fields are provided on the job object for responsibilities, qualifications, and other job characteristics. Use of these separate job fields is recommended. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 100,000.
     * 
     */
    @InputImport(name="description", required=true)
      private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * Optional. The employment type(s) of a job, for example, full time or part time.
     * 
     */
    @InputImport(name="employmentTypes")
      private final @Nullable Input<List<JobEmploymentTypesItem>> employmentTypes;

    public Input<List<JobEmploymentTypesItem>> getEmploymentTypes() {
        return this.employmentTypes == null ? Input.empty() : this.employmentTypes;
    }

    /**
     * Optional. A description of bonus, commission, and other compensation incentives associated with the job not including salary or pay. The maximum number of allowed characters is 10,000.
     * 
     */
    @InputImport(name="incentives")
      private final @Nullable Input<String> incentives;

    public Input<String> getIncentives() {
        return this.incentives == null ? Input.empty() : this.incentives;
    }

    /**
     * Optional. The benefits included with the job.
     * 
     */
    @InputImport(name="jobBenefits")
      private final @Nullable Input<List<JobJobBenefitsItem>> jobBenefits;

    public Input<List<JobJobBenefitsItem>> getJobBenefits() {
        return this.jobBenefits == null ? Input.empty() : this.jobBenefits;
    }

    /**
     * Optional. The end timestamp of the job. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    @InputImport(name="jobEndTime")
      private final @Nullable Input<String> jobEndTime;

    public Input<String> getJobEndTime() {
        return this.jobEndTime == null ? Input.empty() : this.jobEndTime;
    }

    /**
     * Optional. The experience level associated with the job, such as "Entry Level".
     * 
     */
    @InputImport(name="jobLevel")
      private final @Nullable Input<JobJobLevel> jobLevel;

    public Input<JobJobLevel> getJobLevel() {
        return this.jobLevel == null ? Input.empty() : this.jobLevel;
    }

    /**
     * Optional. The start timestamp of the job in UTC time zone. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    @InputImport(name="jobStartTime")
      private final @Nullable Input<String> jobStartTime;

    public Input<String> getJobStartTime() {
        return this.jobStartTime == null ? Input.empty() : this.jobStartTime;
    }

    /**
     * Optional. The language of the posting. This field is distinct from any requirements for fluency that are associated with the job. Language codes must be in BCP-47 format, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47){: class="external" target="_blank" }. If this field is unspecified and Job.description is present, detected language code based on Job.description is assigned, otherwise defaults to 'en_US'.
     * 
     */
    @InputImport(name="languageCode")
      private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    /**
     * Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234". Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional but strongly recommended for the best service experience. The expiration timestamp of the job. After this timestamp, the job is marked as expired, and it no longer appears in search results. The expired job can't be deleted or listed by the DeleteJob and ListJobs APIs, but it can be retrieved with the GetJob API or updated with the UpdateJob API. An expired job can be updated and opened again by using a future expiration timestamp. Updating an expired job fails if there is another existing open job with same company_name, language_code and requisition_id. The expired jobs are retained in our system for 90 days. However, the overall expired job count cannot exceed 3 times the maximum of open jobs count over the past week, otherwise jobs with earlier expire time are cleaned first. Expired jobs are no longer accessible after they are cleaned out. Invalid timestamps are ignored, and treated as expire time not provided. Timestamp before the instant request is made is considered valid, the job will be treated as expired immediately. If this value is not provided at the time of job creation or is invalid, the job posting expires after 30 days from the job's creation time. For example, if the job was created on 2017/01/01 13:00AM UTC with an unspecified expiration date, the job expires after 2017/01/31 13:00AM UTC. If this value is not provided on job update, it depends on the field masks set by UpdateJobRequest.update_mask. If the field masks include expiry_time, or the masks are empty meaning that every field is updated, the job posting expires after 30 days from the job's last update time. Otherwise the expiration date isn't updated.
     * 
     */
    @InputImport(name="postingExpireTime")
      private final @Nullable Input<String> postingExpireTime;

    public Input<String> getPostingExpireTime() {
        return this.postingExpireTime == null ? Input.empty() : this.postingExpireTime;
    }

    /**
     * Optional. The timestamp this job posting was most recently published. The default value is the time the request arrives at the server. Invalid timestamps are ignored.
     * 
     */
    @InputImport(name="postingPublishTime")
      private final @Nullable Input<String> postingPublishTime;

    public Input<String> getPostingPublishTime() {
        return this.postingPublishTime == null ? Input.empty() : this.postingPublishTime;
    }

    /**
     * Optional. The job PostingRegion (for example, state, country) throughout which the job is available. If this field is set, a LocationFilter in a search query within the job region finds this job posting if an exact location match isn't specified. If this field is set to PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job Job.addresses to the same location level as this field is strongly recommended.
     * 
     */
    @InputImport(name="postingRegion")
      private final @Nullable Input<JobPostingRegion> postingRegion;

    public Input<JobPostingRegion> getPostingRegion() {
        return this.postingRegion == null ? Input.empty() : this.postingRegion;
    }

    /**
     * Optional. Options for job processing.
     * 
     */
    @InputImport(name="processingOptions")
      private final @Nullable Input<ProcessingOptionsArgs> processingOptions;

    public Input<ProcessingOptionsArgs> getProcessingOptions() {
        return this.processingOptions == null ? Input.empty() : this.processingOptions;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. A promotion value of the job, as determined by the client. The value determines the sort order of the jobs returned when searching for jobs using the featured jobs search call, with higher promotional values being returned first and ties being resolved by relevance sort. Only the jobs with a promotionValue >0 are returned in a FEATURED_JOB_SEARCH. Default value is 0, and negative values are treated as 0.
     * 
     */
    @InputImport(name="promotionValue")
      private final @Nullable Input<Integer> promotionValue;

    public Input<Integer> getPromotionValue() {
        return this.promotionValue == null ? Input.empty() : this.promotionValue;
    }

    /**
     * Optional. A description of the qualifications required to perform the job. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    @InputImport(name="qualifications")
      private final @Nullable Input<String> qualifications;

    public Input<String> getQualifications() {
        return this.qualifications == null ? Input.empty() : this.qualifications;
    }

    /**
     * The requisition ID, also referred to as the posting ID, assigned by the client to identify a job. This field is intended to be used by clients for client identification and tracking of postings. A job is not allowed to be created if there is another job with the same [company_name], language_code and requisition_id. The maximum number of allowed characters is 255.
     * 
     */
    @InputImport(name="requisitionId", required=true)
      private final Input<String> requisitionId;

    public Input<String> getRequisitionId() {
        return this.requisitionId;
    }

    /**
     * Optional. A description of job responsibilities. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    @InputImport(name="responsibilities")
      private final @Nullable Input<String> responsibilities;

    public Input<String> getResponsibilities() {
        return this.responsibilities == null ? Input.empty() : this.responsibilities;
    }

    /**
     * The title of the job, such as "Software Engineer" The maximum number of allowed characters is 500.
     * 
     */
    @InputImport(name="title", required=true)
      private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public JobArgs(
        @Nullable Input<List<String>> addresses,
        Input<ApplicationInfoArgs> applicationInfo,
        Input<String> companyName,
        @Nullable Input<CompensationInfoArgs> compensationInfo,
        @Nullable Input<Map<String,String>> customAttributes,
        @Nullable Input<List<JobDegreeTypesItem>> degreeTypes,
        @Nullable Input<String> department,
        Input<String> description,
        @Nullable Input<List<JobEmploymentTypesItem>> employmentTypes,
        @Nullable Input<String> incentives,
        @Nullable Input<List<JobJobBenefitsItem>> jobBenefits,
        @Nullable Input<String> jobEndTime,
        @Nullable Input<JobJobLevel> jobLevel,
        @Nullable Input<String> jobStartTime,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> name,
        @Nullable Input<String> postingExpireTime,
        @Nullable Input<String> postingPublishTime,
        @Nullable Input<JobPostingRegion> postingRegion,
        @Nullable Input<ProcessingOptionsArgs> processingOptions,
        @Nullable Input<String> project,
        @Nullable Input<Integer> promotionValue,
        @Nullable Input<String> qualifications,
        Input<String> requisitionId,
        @Nullable Input<String> responsibilities,
        Input<String> title) {
        this.addresses = addresses;
        this.applicationInfo = Objects.requireNonNull(applicationInfo, "expected parameter 'applicationInfo' to be non-null");
        this.companyName = Objects.requireNonNull(companyName, "expected parameter 'companyName' to be non-null");
        this.compensationInfo = compensationInfo;
        this.customAttributes = customAttributes;
        this.degreeTypes = degreeTypes;
        this.department = department;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.employmentTypes = employmentTypes;
        this.incentives = incentives;
        this.jobBenefits = jobBenefits;
        this.jobEndTime = jobEndTime;
        this.jobLevel = jobLevel;
        this.jobStartTime = jobStartTime;
        this.languageCode = languageCode;
        this.name = name;
        this.postingExpireTime = postingExpireTime;
        this.postingPublishTime = postingPublishTime;
        this.postingRegion = postingRegion;
        this.processingOptions = processingOptions;
        this.project = project;
        this.promotionValue = promotionValue;
        this.qualifications = qualifications;
        this.requisitionId = Objects.requireNonNull(requisitionId, "expected parameter 'requisitionId' to be non-null");
        this.responsibilities = responsibilities;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private JobArgs() {
        this.addresses = Input.empty();
        this.applicationInfo = Input.empty();
        this.companyName = Input.empty();
        this.compensationInfo = Input.empty();
        this.customAttributes = Input.empty();
        this.degreeTypes = Input.empty();
        this.department = Input.empty();
        this.description = Input.empty();
        this.employmentTypes = Input.empty();
        this.incentives = Input.empty();
        this.jobBenefits = Input.empty();
        this.jobEndTime = Input.empty();
        this.jobLevel = Input.empty();
        this.jobStartTime = Input.empty();
        this.languageCode = Input.empty();
        this.name = Input.empty();
        this.postingExpireTime = Input.empty();
        this.postingPublishTime = Input.empty();
        this.postingRegion = Input.empty();
        this.processingOptions = Input.empty();
        this.project = Input.empty();
        this.promotionValue = Input.empty();
        this.qualifications = Input.empty();
        this.requisitionId = Input.empty();
        this.responsibilities = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addresses;
        private Input<ApplicationInfoArgs> applicationInfo;
        private Input<String> companyName;
        private @Nullable Input<CompensationInfoArgs> compensationInfo;
        private @Nullable Input<Map<String,String>> customAttributes;
        private @Nullable Input<List<JobDegreeTypesItem>> degreeTypes;
        private @Nullable Input<String> department;
        private Input<String> description;
        private @Nullable Input<List<JobEmploymentTypesItem>> employmentTypes;
        private @Nullable Input<String> incentives;
        private @Nullable Input<List<JobJobBenefitsItem>> jobBenefits;
        private @Nullable Input<String> jobEndTime;
        private @Nullable Input<JobJobLevel> jobLevel;
        private @Nullable Input<String> jobStartTime;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> postingExpireTime;
        private @Nullable Input<String> postingPublishTime;
        private @Nullable Input<JobPostingRegion> postingRegion;
        private @Nullable Input<ProcessingOptionsArgs> processingOptions;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> promotionValue;
        private @Nullable Input<String> qualifications;
        private Input<String> requisitionId;
        private @Nullable Input<String> responsibilities;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.applicationInfo = defaults.applicationInfo;
    	      this.companyName = defaults.companyName;
    	      this.compensationInfo = defaults.compensationInfo;
    	      this.customAttributes = defaults.customAttributes;
    	      this.degreeTypes = defaults.degreeTypes;
    	      this.department = defaults.department;
    	      this.description = defaults.description;
    	      this.employmentTypes = defaults.employmentTypes;
    	      this.incentives = defaults.incentives;
    	      this.jobBenefits = defaults.jobBenefits;
    	      this.jobEndTime = defaults.jobEndTime;
    	      this.jobLevel = defaults.jobLevel;
    	      this.jobStartTime = defaults.jobStartTime;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
    	      this.postingExpireTime = defaults.postingExpireTime;
    	      this.postingPublishTime = defaults.postingPublishTime;
    	      this.postingRegion = defaults.postingRegion;
    	      this.processingOptions = defaults.processingOptions;
    	      this.project = defaults.project;
    	      this.promotionValue = defaults.promotionValue;
    	      this.qualifications = defaults.qualifications;
    	      this.requisitionId = defaults.requisitionId;
    	      this.responsibilities = defaults.responsibilities;
    	      this.title = defaults.title;
        }

        public Builder setAddresses(@Nullable Input<List<String>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setAddresses(@Nullable List<String> addresses) {
            this.addresses = Input.ofNullable(addresses);
            return this;
        }

        public Builder setApplicationInfo(Input<ApplicationInfoArgs> applicationInfo) {
            this.applicationInfo = Objects.requireNonNull(applicationInfo);
            return this;
        }

        public Builder setApplicationInfo(ApplicationInfoArgs applicationInfo) {
            this.applicationInfo = Input.of(Objects.requireNonNull(applicationInfo));
            return this;
        }

        public Builder setCompanyName(Input<String> companyName) {
            this.companyName = Objects.requireNonNull(companyName);
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = Input.of(Objects.requireNonNull(companyName));
            return this;
        }

        public Builder setCompensationInfo(@Nullable Input<CompensationInfoArgs> compensationInfo) {
            this.compensationInfo = compensationInfo;
            return this;
        }

        public Builder setCompensationInfo(@Nullable CompensationInfoArgs compensationInfo) {
            this.compensationInfo = Input.ofNullable(compensationInfo);
            return this;
        }

        public Builder setCustomAttributes(@Nullable Input<Map<String,String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }

        public Builder setCustomAttributes(@Nullable Map<String,String> customAttributes) {
            this.customAttributes = Input.ofNullable(customAttributes);
            return this;
        }

        public Builder setDegreeTypes(@Nullable Input<List<JobDegreeTypesItem>> degreeTypes) {
            this.degreeTypes = degreeTypes;
            return this;
        }

        public Builder setDegreeTypes(@Nullable List<JobDegreeTypesItem> degreeTypes) {
            this.degreeTypes = Input.ofNullable(degreeTypes);
            return this;
        }

        public Builder setDepartment(@Nullable Input<String> department) {
            this.department = department;
            return this;
        }

        public Builder setDepartment(@Nullable String department) {
            this.department = Input.ofNullable(department);
            return this;
        }

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setEmploymentTypes(@Nullable Input<List<JobEmploymentTypesItem>> employmentTypes) {
            this.employmentTypes = employmentTypes;
            return this;
        }

        public Builder setEmploymentTypes(@Nullable List<JobEmploymentTypesItem> employmentTypes) {
            this.employmentTypes = Input.ofNullable(employmentTypes);
            return this;
        }

        public Builder setIncentives(@Nullable Input<String> incentives) {
            this.incentives = incentives;
            return this;
        }

        public Builder setIncentives(@Nullable String incentives) {
            this.incentives = Input.ofNullable(incentives);
            return this;
        }

        public Builder setJobBenefits(@Nullable Input<List<JobJobBenefitsItem>> jobBenefits) {
            this.jobBenefits = jobBenefits;
            return this;
        }

        public Builder setJobBenefits(@Nullable List<JobJobBenefitsItem> jobBenefits) {
            this.jobBenefits = Input.ofNullable(jobBenefits);
            return this;
        }

        public Builder setJobEndTime(@Nullable Input<String> jobEndTime) {
            this.jobEndTime = jobEndTime;
            return this;
        }

        public Builder setJobEndTime(@Nullable String jobEndTime) {
            this.jobEndTime = Input.ofNullable(jobEndTime);
            return this;
        }

        public Builder setJobLevel(@Nullable Input<JobJobLevel> jobLevel) {
            this.jobLevel = jobLevel;
            return this;
        }

        public Builder setJobLevel(@Nullable JobJobLevel jobLevel) {
            this.jobLevel = Input.ofNullable(jobLevel);
            return this;
        }

        public Builder setJobStartTime(@Nullable Input<String> jobStartTime) {
            this.jobStartTime = jobStartTime;
            return this;
        }

        public Builder setJobStartTime(@Nullable String jobStartTime) {
            this.jobStartTime = Input.ofNullable(jobStartTime);
            return this;
        }

        public Builder setLanguageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPostingExpireTime(@Nullable Input<String> postingExpireTime) {
            this.postingExpireTime = postingExpireTime;
            return this;
        }

        public Builder setPostingExpireTime(@Nullable String postingExpireTime) {
            this.postingExpireTime = Input.ofNullable(postingExpireTime);
            return this;
        }

        public Builder setPostingPublishTime(@Nullable Input<String> postingPublishTime) {
            this.postingPublishTime = postingPublishTime;
            return this;
        }

        public Builder setPostingPublishTime(@Nullable String postingPublishTime) {
            this.postingPublishTime = Input.ofNullable(postingPublishTime);
            return this;
        }

        public Builder setPostingRegion(@Nullable Input<JobPostingRegion> postingRegion) {
            this.postingRegion = postingRegion;
            return this;
        }

        public Builder setPostingRegion(@Nullable JobPostingRegion postingRegion) {
            this.postingRegion = Input.ofNullable(postingRegion);
            return this;
        }

        public Builder setProcessingOptions(@Nullable Input<ProcessingOptionsArgs> processingOptions) {
            this.processingOptions = processingOptions;
            return this;
        }

        public Builder setProcessingOptions(@Nullable ProcessingOptionsArgs processingOptions) {
            this.processingOptions = Input.ofNullable(processingOptions);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPromotionValue(@Nullable Input<Integer> promotionValue) {
            this.promotionValue = promotionValue;
            return this;
        }

        public Builder setPromotionValue(@Nullable Integer promotionValue) {
            this.promotionValue = Input.ofNullable(promotionValue);
            return this;
        }

        public Builder setQualifications(@Nullable Input<String> qualifications) {
            this.qualifications = qualifications;
            return this;
        }

        public Builder setQualifications(@Nullable String qualifications) {
            this.qualifications = Input.ofNullable(qualifications);
            return this;
        }

        public Builder setRequisitionId(Input<String> requisitionId) {
            this.requisitionId = Objects.requireNonNull(requisitionId);
            return this;
        }

        public Builder setRequisitionId(String requisitionId) {
            this.requisitionId = Input.of(Objects.requireNonNull(requisitionId));
            return this;
        }

        public Builder setResponsibilities(@Nullable Input<String> responsibilities) {
            this.responsibilities = responsibilities;
            return this;
        }

        public Builder setResponsibilities(@Nullable String responsibilities) {
            this.responsibilities = Input.ofNullable(responsibilities);
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }
        public JobArgs build() {
            return new JobArgs(addresses, applicationInfo, companyName, compensationInfo, customAttributes, degreeTypes, department, description, employmentTypes, incentives, jobBenefits, jobEndTime, jobLevel, jobStartTime, languageCode, name, postingExpireTime, postingPublishTime, postingRegion, processingOptions, project, promotionValue, qualifications, requisitionId, responsibilities, title);
        }
    }
}
