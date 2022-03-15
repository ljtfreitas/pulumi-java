// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerDnsAliasResult {
    /**
     * The fully qualified DNS record for alias
     * 
     */
    private final String azureDnsRecord;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerDnsAliasResult(
        @CustomType.Parameter("azureDnsRecord") String azureDnsRecord,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.azureDnsRecord = azureDnsRecord;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * The fully qualified DNS record for alias
     * 
    */
    public String getAzureDnsRecord() {
        return this.azureDnsRecord;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerDnsAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureDnsRecord;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerDnsAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDnsRecord = defaults.azureDnsRecord;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder azureDnsRecord(String azureDnsRecord) {
            this.azureDnsRecord = Objects.requireNonNull(azureDnsRecord);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServerDnsAliasResult build() {
            return new GetServerDnsAliasResult(azureDnsRecord, id, name, type);
        }
    }
}
