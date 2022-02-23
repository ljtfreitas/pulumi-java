// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetManagedPrefixListEntry;
import io.pulumi.aws.ec2.outputs.GetManagedPrefixListFilter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedPrefixListResult {
    /**
     * The address family of the prefix list. Valid values are `IPv4` and `IPv6`.
     * 
     */
    private final String addressFamily;
    /**
     * The ARN of the selected prefix list.
     * 
     */
    private final String arn;
    /**
     * The set of entries in this prefix list. Each entry is an object with `cidr` and `description`.
     * 
     */
    private final List<GetManagedPrefixListEntry> entries;
    private final @Nullable List<GetManagedPrefixListFilter> filters;
    /**
     * The ID of the selected prefix list.
     * 
     */
    private final String id;
    /**
     * When then prefix list is managed, the maximum number of entries it supports, or null otherwise.
     * 
     */
    private final Integer maxEntries;
    /**
     * The name of the selected prefix list.
     * 
     */
    private final String name;
    /**
     * The Account ID of the owner of a customer-managed prefix list, or `AWS` otherwise.
     * 
     */
    private final String ownerId;
    /**
     * A map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    private final Integer version;

    @OutputCustomType.Constructor({"addressFamily","arn","entries","filters","id","maxEntries","name","ownerId","tags","version"})
    private GetManagedPrefixListResult(
        String addressFamily,
        String arn,
        List<GetManagedPrefixListEntry> entries,
        @Nullable List<GetManagedPrefixListFilter> filters,
        String id,
        Integer maxEntries,
        String name,
        String ownerId,
        Map<String,String> tags,
        Integer version) {
        this.addressFamily = Objects.requireNonNull(addressFamily);
        this.arn = Objects.requireNonNull(arn);
        this.entries = Objects.requireNonNull(entries);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.maxEntries = Objects.requireNonNull(maxEntries);
        this.name = Objects.requireNonNull(name);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.tags = Objects.requireNonNull(tags);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The address family of the prefix list. Valid values are `IPv4` and `IPv6`.
     * 
     */
    public String getAddressFamily() {
        return this.addressFamily;
    }
    /**
     * The ARN of the selected prefix list.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The set of entries in this prefix list. Each entry is an object with `cidr` and `description`.
     * 
     */
    public List<GetManagedPrefixListEntry> getEntries() {
        return this.entries;
    }
    public List<GetManagedPrefixListFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The ID of the selected prefix list.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * When then prefix list is managed, the maximum number of entries it supports, or null otherwise.
     * 
     */
    public Integer getMaxEntries() {
        return this.maxEntries;
    }
    /**
     * The name of the selected prefix list.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The Account ID of the owner of a customer-managed prefix list, or `AWS` otherwise.
     * 
     */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * A map of tags assigned to the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedPrefixListResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressFamily;
        private String arn;
        private List<GetManagedPrefixListEntry> entries;
        private @Nullable List<GetManagedPrefixListFilter> filters;
        private String id;
        private Integer maxEntries;
        private String name;
        private String ownerId;
        private Map<String,String> tags;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedPrefixListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.arn = defaults.arn;
    	      this.entries = defaults.entries;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.maxEntries = defaults.maxEntries;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setAddressFamily(String addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setEntries(List<GetManagedPrefixListEntry> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }

        public Builder setFilters(@Nullable List<GetManagedPrefixListFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMaxEntries(Integer maxEntries) {
            this.maxEntries = Objects.requireNonNull(maxEntries);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetManagedPrefixListResult build() {
            return new GetManagedPrefixListResult(addressFamily, arn, entries, filters, id, maxEntries, name, ownerId, tags, version);
        }
    }
}
