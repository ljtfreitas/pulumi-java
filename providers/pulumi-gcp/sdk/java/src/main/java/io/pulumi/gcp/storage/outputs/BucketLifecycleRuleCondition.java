// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRuleCondition {
    /**
     * Minimum age of an object in days to satisfy this condition.
     * 
     */
    private final @Nullable Integer age;
    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
     */
    private final @Nullable String createdBefore;
    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
     * 
     */
    private final @Nullable String customTimeBefore;
    /**
     * Days since the date set in the `customTime` metadata for the object. This condition is satisfied when the current date and time is at least the specified number of days after the `customTime`.
     * 
     */
    private final @Nullable Integer daysSinceCustomTime;
    /**
     * Relevant only for versioned objects. Number of days elapsed since the noncurrent timestamp of an object.
     * 
     */
    private final @Nullable Integer daysSinceNoncurrentTime;
    /**
     * [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
     * 
     */
    private final @Nullable List<String> matchesStorageClasses;
    /**
     * Relevant only for versioned objects. The date in RFC 3339 (e.g. `2017-06-13`) when the object became nonconcurrent.
     * 
     */
    private final @Nullable String noncurrentTimeBefore;
    /**
     * Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
     * 
     */
    private final @Nullable Integer numNewerVersions;
    /**
     * Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `"LIVE"`, `"ARCHIVED"`, `"ANY"`.
     * 
     */
    private final @Nullable String withState;

    @CustomType.Constructor
    private BucketLifecycleRuleCondition(
        @CustomType.Parameter("age") @Nullable Integer age,
        @CustomType.Parameter("createdBefore") @Nullable String createdBefore,
        @CustomType.Parameter("customTimeBefore") @Nullable String customTimeBefore,
        @CustomType.Parameter("daysSinceCustomTime") @Nullable Integer daysSinceCustomTime,
        @CustomType.Parameter("daysSinceNoncurrentTime") @Nullable Integer daysSinceNoncurrentTime,
        @CustomType.Parameter("matchesStorageClasses") @Nullable List<String> matchesStorageClasses,
        @CustomType.Parameter("noncurrentTimeBefore") @Nullable String noncurrentTimeBefore,
        @CustomType.Parameter("numNewerVersions") @Nullable Integer numNewerVersions,
        @CustomType.Parameter("withState") @Nullable String withState) {
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

    /**
     * Minimum age of an object in days to satisfy this condition.
     * 
    */
    public Optional<Integer> getAge() {
        return Optional.ofNullable(this.age);
    }
    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
    */
    public Optional<String> getCreatedBefore() {
        return Optional.ofNullable(this.createdBefore);
    }
    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
     * 
    */
    public Optional<String> getCustomTimeBefore() {
        return Optional.ofNullable(this.customTimeBefore);
    }
    /**
     * Days since the date set in the `customTime` metadata for the object. This condition is satisfied when the current date and time is at least the specified number of days after the `customTime`.
     * 
    */
    public Optional<Integer> getDaysSinceCustomTime() {
        return Optional.ofNullable(this.daysSinceCustomTime);
    }
    /**
     * Relevant only for versioned objects. Number of days elapsed since the noncurrent timestamp of an object.
     * 
    */
    public Optional<Integer> getDaysSinceNoncurrentTime() {
        return Optional.ofNullable(this.daysSinceNoncurrentTime);
    }
    /**
     * [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
     * 
    */
    public List<String> getMatchesStorageClasses() {
        return this.matchesStorageClasses == null ? List.of() : this.matchesStorageClasses;
    }
    /**
     * Relevant only for versioned objects. The date in RFC 3339 (e.g. `2017-06-13`) when the object became nonconcurrent.
     * 
    */
    public Optional<String> getNoncurrentTimeBefore() {
        return Optional.ofNullable(this.noncurrentTimeBefore);
    }
    /**
     * Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
     * 
    */
    public Optional<Integer> getNumNewerVersions() {
        return Optional.ofNullable(this.numNewerVersions);
    }
    /**
     * Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `"LIVE"`, `"ARCHIVED"`, `"ANY"`.
     * 
    */
    public Optional<String> getWithState() {
        return Optional.ofNullable(this.withState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer age;
        private @Nullable String createdBefore;
        private @Nullable String customTimeBefore;
        private @Nullable Integer daysSinceCustomTime;
        private @Nullable Integer daysSinceNoncurrentTime;
        private @Nullable List<String> matchesStorageClasses;
        private @Nullable String noncurrentTimeBefore;
        private @Nullable Integer numNewerVersions;
        private @Nullable String withState;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleCondition defaults) {
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

        public Builder age(@Nullable Integer age) {
            this.age = age;
            return this;
        }

        public Builder createdBefore(@Nullable String createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder customTimeBefore(@Nullable String customTimeBefore) {
            this.customTimeBefore = customTimeBefore;
            return this;
        }

        public Builder daysSinceCustomTime(@Nullable Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = daysSinceCustomTime;
            return this;
        }

        public Builder daysSinceNoncurrentTime(@Nullable Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = daysSinceNoncurrentTime;
            return this;
        }

        public Builder matchesStorageClasses(@Nullable List<String> matchesStorageClasses) {
            this.matchesStorageClasses = matchesStorageClasses;
            return this;
        }

        public Builder noncurrentTimeBefore(@Nullable String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = noncurrentTimeBefore;
            return this;
        }

        public Builder numNewerVersions(@Nullable Integer numNewerVersions) {
            this.numNewerVersions = numNewerVersions;
            return this;
        }

        public Builder withState(@Nullable String withState) {
            this.withState = withState;
            return this;
        }
        public BucketLifecycleRuleCondition build() {
            return new BucketLifecycleRuleCondition(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, matchesStorageClasses, noncurrentTimeBefore, numNewerVersions, withState);
        }
    }
}
