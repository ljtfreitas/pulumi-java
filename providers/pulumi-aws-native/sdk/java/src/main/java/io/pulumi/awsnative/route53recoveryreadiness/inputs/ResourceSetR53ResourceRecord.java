// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Route 53 resource that a DNS target resource record points to.
 * 
 */
public final class ResourceSetR53ResourceRecord extends io.pulumi.resources.InvokeArgs {

    public static final ResourceSetR53ResourceRecord Empty = new ResourceSetR53ResourceRecord();

    /**
     * The DNS target domain name.
     * 
     */
    @InputImport(name="domainName")
        private final @Nullable String domainName;

    public Optional<String> getDomainName() {
        return this.domainName == null ? Optional.empty() : Optional.ofNullable(this.domainName);
    }

    /**
     * The Resource Record set id.
     * 
     */
    @InputImport(name="recordSetId")
        private final @Nullable String recordSetId;

    public Optional<String> getRecordSetId() {
        return this.recordSetId == null ? Optional.empty() : Optional.ofNullable(this.recordSetId);
    }

    public ResourceSetR53ResourceRecord(
        @Nullable String domainName,
        @Nullable String recordSetId) {
        this.domainName = domainName;
        this.recordSetId = recordSetId;
    }

    private ResourceSetR53ResourceRecord() {
        this.domainName = null;
        this.recordSetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetR53ResourceRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String recordSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetR53ResourceRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.recordSetId = defaults.recordSetId;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setRecordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }
        public ResourceSetR53ResourceRecord build() {
            return new ResourceSetR53ResourceRecord(domainName, recordSetId);
        }
    }
}
