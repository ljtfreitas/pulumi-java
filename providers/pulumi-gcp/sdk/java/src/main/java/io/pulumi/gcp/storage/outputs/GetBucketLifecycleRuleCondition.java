// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBucketLifecycleRuleCondition {
    private final Integer age;
    private final String createdBefore;
    private final String customTimeBefore;
    private final Integer daysSinceCustomTime;
    private final Integer daysSinceNoncurrentTime;
    private final List<String> matchesStorageClasses;
    private final String noncurrentTimeBefore;
    private final Integer numNewerVersions;
    private final String withState;

    @CustomType.Constructor
    private GetBucketLifecycleRuleCondition(
        @CustomType.Parameter("age") Integer age,
        @CustomType.Parameter("createdBefore") String createdBefore,
        @CustomType.Parameter("customTimeBefore") String customTimeBefore,
        @CustomType.Parameter("daysSinceCustomTime") Integer daysSinceCustomTime,
        @CustomType.Parameter("daysSinceNoncurrentTime") Integer daysSinceNoncurrentTime,
        @CustomType.Parameter("matchesStorageClasses") List<String> matchesStorageClasses,
        @CustomType.Parameter("noncurrentTimeBefore") String noncurrentTimeBefore,
        @CustomType.Parameter("numNewerVersions") Integer numNewerVersions,
        @CustomType.Parameter("withState") String withState) {
        this.age = age;
        this.createdBefore = createdBefore;
        this.customTimeBefore = customTimeBefore;
        this.daysSinceCustomTime = daysSinceCustomTime;
        this.daysSinceNoncurrentTime = daysSinceNoncurrentTime;
        this.matchesStorageClasses = matchesStorageClasses;
        this.noncurrentTimeBefore = noncurrentTimeBefore;
        this.numNewerVersions = numNewerVersions;
        this.withState = withState;
    }

    public Integer getAge() {
        return this.age;
    }
    public String getCreatedBefore() {
        return this.createdBefore;
    }
    public String getCustomTimeBefore() {
        return this.customTimeBefore;
    }
    public Integer getDaysSinceCustomTime() {
        return this.daysSinceCustomTime;
    }
    public Integer getDaysSinceNoncurrentTime() {
        return this.daysSinceNoncurrentTime;
    }
    public List<String> getMatchesStorageClasses() {
        return this.matchesStorageClasses;
    }
    public String getNoncurrentTimeBefore() {
        return this.noncurrentTimeBefore;
    }
    public Integer getNumNewerVersions() {
        return this.numNewerVersions;
    }
    public String getWithState() {
        return this.withState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketLifecycleRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer age;
        private String createdBefore;
        private String customTimeBefore;
        private Integer daysSinceCustomTime;
        private Integer daysSinceNoncurrentTime;
        private List<String> matchesStorageClasses;
        private String noncurrentTimeBefore;
        private Integer numNewerVersions;
        private String withState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketLifecycleRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.age = defaults.age;
    	      this.createdBefore = defaults.createdBefore;
    	      this.customTimeBefore = defaults.customTimeBefore;
    	      this.daysSinceCustomTime = defaults.daysSinceCustomTime;
    	      this.daysSinceNoncurrentTime = defaults.daysSinceNoncurrentTime;
    	      this.matchesStorageClasses = defaults.matchesStorageClasses;
    	      this.noncurrentTimeBefore = defaults.noncurrentTimeBefore;
    	      this.numNewerVersions = defaults.numNewerVersions;
    	      this.withState = defaults.withState;
        }

        public Builder age(Integer age) {
            this.age = Objects.requireNonNull(age);
            return this;
        }

        public Builder createdBefore(String createdBefore) {
            this.createdBefore = Objects.requireNonNull(createdBefore);
            return this;
        }

        public Builder customTimeBefore(String customTimeBefore) {
            this.customTimeBefore = Objects.requireNonNull(customTimeBefore);
            return this;
        }

        public Builder daysSinceCustomTime(Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime);
            return this;
        }

        public Builder daysSinceNoncurrentTime(Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime);
            return this;
        }

        public Builder matchesStorageClasses(List<String> matchesStorageClasses) {
            this.matchesStorageClasses = Objects.requireNonNull(matchesStorageClasses);
            return this;
        }

        public Builder noncurrentTimeBefore(String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore);
            return this;
        }

        public Builder numNewerVersions(Integer numNewerVersions) {
            this.numNewerVersions = Objects.requireNonNull(numNewerVersions);
            return this;
        }

        public Builder withState(String withState) {
            this.withState = Objects.requireNonNull(withState);
            return this;
        }
        public GetBucketLifecycleRuleCondition build() {
            return new GetBucketLifecycleRuleCondition(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, matchesStorageClasses, noncurrentTimeBefore, numNewerVersions, withState);
        }
    }
}
