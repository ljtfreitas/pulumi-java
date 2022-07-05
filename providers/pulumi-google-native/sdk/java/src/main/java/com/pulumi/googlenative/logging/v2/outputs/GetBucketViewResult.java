// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBucketViewResult {
    /**
     * @return The creation timestamp of the view.
     * 
     */
    private final String createTime;
    /**
     * @return Describes this view.
     * 
     */
    private final String description;
    /**
     * @return Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE(&#34;projects/myproject&#34;) AND resource.type = &#34;gce_instance&#34; AND LOG_ID(&#34;stdout&#34;)
     * 
     */
    private final String filter;
    /**
     * @return The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
     * 
     */
    private final String name;
    /**
     * @return The last update timestamp of the view.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetBucketViewResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.filter = filter;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * @return The creation timestamp of the view.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Describes this view.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE(&#34;projects/myproject&#34;) AND resource.type = &#34;gce_instance&#34; AND LOG_ID(&#34;stdout&#34;)
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The last update timestamp of the view.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketViewResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String filter;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketViewResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetBucketViewResult build() {
            return new GetBucketViewResult(createTime, description, filter, name, updateTime);
        }
    }
}
