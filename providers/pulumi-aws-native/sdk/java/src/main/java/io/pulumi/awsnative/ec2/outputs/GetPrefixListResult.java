// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.PrefixListAddressFamily;
import io.pulumi.awsnative.ec2.outputs.PrefixListEntry;
import io.pulumi.awsnative.ec2.outputs.PrefixListTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrefixListResult {
    /**
     * Ip Version of Prefix List.
     * 
     */
    private final @Nullable PrefixListAddressFamily addressFamily;
    /**
     * The Amazon Resource Name (ARN) of the Prefix List.
     * 
     */
    private final @Nullable String arn;
    /**
     * Entries of Prefix List.
     * 
     */
    private final @Nullable List<PrefixListEntry> entries;
    /**
     * Max Entries of Prefix List.
     * 
     */
    private final @Nullable Integer maxEntries;
    /**
     * Owner Id of Prefix List.
     * 
     */
    private final @Nullable String ownerId;
    /**
     * Id of Prefix List.
     * 
     */
    private final @Nullable String prefixListId;
    /**
     * Name of Prefix List.
     * 
     */
    private final @Nullable String prefixListName;
    /**
     * Tags for Prefix List
     * 
     */
    private final @Nullable List<PrefixListTag> tags;
    /**
     * Version of Prefix List.
     * 
     */
    private final @Nullable Integer version;

    @OutputCustomType.Constructor({"addressFamily","arn","entries","maxEntries","ownerId","prefixListId","prefixListName","tags","version"})
    private GetPrefixListResult(
        @Nullable PrefixListAddressFamily addressFamily,
        @Nullable String arn,
        @Nullable List<PrefixListEntry> entries,
        @Nullable Integer maxEntries,
        @Nullable String ownerId,
        @Nullable String prefixListId,
        @Nullable String prefixListName,
        @Nullable List<PrefixListTag> tags,
        @Nullable Integer version) {
        this.addressFamily = addressFamily;
        this.arn = arn;
        this.entries = entries;
        this.maxEntries = maxEntries;
        this.ownerId = ownerId;
        this.prefixListId = prefixListId;
        this.prefixListName = prefixListName;
        this.tags = tags;
        this.version = version;
    }

    /**
     * Ip Version of Prefix List.
     * 
     */
    public Optional<PrefixListAddressFamily> getAddressFamily() {
        return Optional.ofNullable(this.addressFamily);
    }
    /**
     * The Amazon Resource Name (ARN) of the Prefix List.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Entries of Prefix List.
     * 
     */
    public List<PrefixListEntry> getEntries() {
        return this.entries == null ? List.of() : this.entries;
    }
    /**
     * Max Entries of Prefix List.
     * 
     */
    public Optional<Integer> getMaxEntries() {
        return Optional.ofNullable(this.maxEntries);
    }
    /**
     * Owner Id of Prefix List.
     * 
     */
    public Optional<String> getOwnerId() {
        return Optional.ofNullable(this.ownerId);
    }
    /**
     * Id of Prefix List.
     * 
     */
    public Optional<String> getPrefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }
    /**
     * Name of Prefix List.
     * 
     */
    public Optional<String> getPrefixListName() {
        return Optional.ofNullable(this.prefixListName);
    }
    /**
     * Tags for Prefix List
     * 
     */
    public List<PrefixListTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Version of Prefix List.
     * 
     */
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrefixListAddressFamily addressFamily;
        private @Nullable String arn;
        private @Nullable List<PrefixListEntry> entries;
        private @Nullable Integer maxEntries;
        private @Nullable String ownerId;
        private @Nullable String prefixListId;
        private @Nullable String prefixListName;
        private @Nullable List<PrefixListTag> tags;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrefixListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.arn = defaults.arn;
    	      this.entries = defaults.entries;
    	      this.maxEntries = defaults.maxEntries;
    	      this.ownerId = defaults.ownerId;
    	      this.prefixListId = defaults.prefixListId;
    	      this.prefixListName = defaults.prefixListName;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setAddressFamily(@Nullable PrefixListAddressFamily addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setEntries(@Nullable List<PrefixListEntry> entries) {
            this.entries = entries;
            return this;
        }

        public Builder setMaxEntries(@Nullable Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setPrefixListId(@Nullable String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        public Builder setPrefixListName(@Nullable String prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }

        public Builder setTags(@Nullable List<PrefixListTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public GetPrefixListResult build() {
            return new GetPrefixListResult(addressFamily, arn, entries, maxEntries, ownerId, prefixListId, prefixListName, tags, version);
        }
    }
}
