// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketObjectsResult {
    private final String bucket;
    /**
     * List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
     * 
     */
    private final List<String> commonPrefixes;
    private final @Nullable String delimiter;
    private final @Nullable String encodingType;
    private final @Nullable Boolean fetchOwner;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of strings representing object keys
     * 
     */
    private final List<String> keys;
    private final @Nullable Integer maxKeys;
    /**
     * List of strings representing object owner IDs (see `fetch_owner` above)
     * 
     */
    private final List<String> owners;
    private final @Nullable String prefix;
    private final @Nullable String startAfter;

    @CustomType.Constructor
    private GetBucketObjectsResult(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("commonPrefixes") List<String> commonPrefixes,
        @CustomType.Parameter("delimiter") @Nullable String delimiter,
        @CustomType.Parameter("encodingType") @Nullable String encodingType,
        @CustomType.Parameter("fetchOwner") @Nullable Boolean fetchOwner,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keys") List<String> keys,
        @CustomType.Parameter("maxKeys") @Nullable Integer maxKeys,
        @CustomType.Parameter("owners") List<String> owners,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("startAfter") @Nullable String startAfter) {
        this.bucket = bucket;
        this.commonPrefixes = commonPrefixes;
        this.delimiter = delimiter;
        this.encodingType = encodingType;
        this.fetchOwner = fetchOwner;
        this.id = id;
        this.keys = keys;
        this.maxKeys = maxKeys;
        this.owners = owners;
        this.prefix = prefix;
        this.startAfter = startAfter;
    }

    public String getBucket() {
        return this.bucket;
    }
    /**
     * List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
     * 
    */
    public List<String> getCommonPrefixes() {
        return this.commonPrefixes;
    }
    public Optional<String> getDelimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    public Optional<String> getEncodingType() {
        return Optional.ofNullable(this.encodingType);
    }
    public Optional<Boolean> getFetchOwner() {
        return Optional.ofNullable(this.fetchOwner);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of strings representing object keys
     * 
    */
    public List<String> getKeys() {
        return this.keys;
    }
    public Optional<Integer> getMaxKeys() {
        return Optional.ofNullable(this.maxKeys);
    }
    /**
     * List of strings representing object owner IDs (see `fetch_owner` above)
     * 
    */
    public List<String> getOwners() {
        return this.owners;
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    public Optional<String> getStartAfter() {
        return Optional.ofNullable(this.startAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private List<String> commonPrefixes;
        private @Nullable String delimiter;
        private @Nullable String encodingType;
        private @Nullable Boolean fetchOwner;
        private String id;
        private List<String> keys;
        private @Nullable Integer maxKeys;
        private List<String> owners;
        private @Nullable String prefix;
        private @Nullable String startAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.commonPrefixes = defaults.commonPrefixes;
    	      this.delimiter = defaults.delimiter;
    	      this.encodingType = defaults.encodingType;
    	      this.fetchOwner = defaults.fetchOwner;
    	      this.id = defaults.id;
    	      this.keys = defaults.keys;
    	      this.maxKeys = defaults.maxKeys;
    	      this.owners = defaults.owners;
    	      this.prefix = defaults.prefix;
    	      this.startAfter = defaults.startAfter;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder commonPrefixes(List<String> commonPrefixes) {
            this.commonPrefixes = Objects.requireNonNull(commonPrefixes);
            return this;
        }

        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public Builder encodingType(@Nullable String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        public Builder fetchOwner(@Nullable Boolean fetchOwner) {
            this.fetchOwner = fetchOwner;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder keys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }

        public Builder maxKeys(@Nullable Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder startAfter(@Nullable String startAfter) {
            this.startAfter = startAfter;
            return this;
        }
        public GetBucketObjectsResult build() {
            return new GetBucketObjectsResult(bucket, commonPrefixes, delimiter, encodingType, fetchOwner, id, keys, maxKeys, owners, prefix, startAfter);
        }
    }
}
