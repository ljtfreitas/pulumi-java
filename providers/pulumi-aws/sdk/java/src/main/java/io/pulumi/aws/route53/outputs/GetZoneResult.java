// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZoneResult {
    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
     */
    private final String arn;
    /**
     * Caller Reference of the Hosted Zone.
     * 
     */
    private final String callerReference;
    /**
     * The comment field of the Hosted Zone.
     * 
     */
    private final String comment;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The description provided by the service that created the Hosted Zone (e.g., `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
     * 
     */
    private final String linkedServiceDescription;
    /**
     * The service that created the Hosted Zone (e.g., `servicediscovery.amazonaws.com`).
     * 
     */
    private final String linkedServicePrincipal;
    private final String name;
    /**
     * The list of DNS name servers for the Hosted Zone.
     * 
     */
    private final List<String> nameServers;
    private final @Nullable Boolean privateZone;
    /**
     * The number of Record Set in the Hosted Zone.
     * 
     */
    private final Integer resourceRecordSetCount;
    private final Map<String,String> tags;
    private final String vpcId;
    private final String zoneId;

    @CustomType.Constructor
    private GetZoneResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("callerReference") String callerReference,
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedServiceDescription") String linkedServiceDescription,
        @CustomType.Parameter("linkedServicePrincipal") String linkedServicePrincipal,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameServers") List<String> nameServers,
        @CustomType.Parameter("privateZone") @Nullable Boolean privateZone,
        @CustomType.Parameter("resourceRecordSetCount") Integer resourceRecordSetCount,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.arn = arn;
        this.callerReference = callerReference;
        this.comment = comment;
        this.id = id;
        this.linkedServiceDescription = linkedServiceDescription;
        this.linkedServicePrincipal = linkedServicePrincipal;
        this.name = name;
        this.nameServers = nameServers;
        this.privateZone = privateZone;
        this.resourceRecordSetCount = resourceRecordSetCount;
        this.tags = tags;
        this.vpcId = vpcId;
        this.zoneId = zoneId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Caller Reference of the Hosted Zone.
     * 
    */
    public String getCallerReference() {
        return this.callerReference;
    }
    /**
     * The comment field of the Hosted Zone.
     * 
    */
    public String getComment() {
        return this.comment;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The description provided by the service that created the Hosted Zone (e.g., `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
     * 
    */
    public String getLinkedServiceDescription() {
        return this.linkedServiceDescription;
    }
    /**
     * The service that created the Hosted Zone (e.g., `servicediscovery.amazonaws.com`).
     * 
    */
    public String getLinkedServicePrincipal() {
        return this.linkedServicePrincipal;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The list of DNS name servers for the Hosted Zone.
     * 
    */
    public List<String> getNameServers() {
        return this.nameServers;
    }
    public Optional<Boolean> getPrivateZone() {
        return Optional.ofNullable(this.privateZone);
    }
    /**
     * The number of Record Set in the Hosted Zone.
     * 
    */
    public Integer getResourceRecordSetCount() {
        return this.resourceRecordSetCount;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getVpcId() {
        return this.vpcId;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String callerReference;
        private String comment;
        private String id;
        private String linkedServiceDescription;
        private String linkedServicePrincipal;
        private String name;
        private List<String> nameServers;
        private @Nullable Boolean privateZone;
        private Integer resourceRecordSetCount;
        private Map<String,String> tags;
        private String vpcId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.callerReference = defaults.callerReference;
    	      this.comment = defaults.comment;
    	      this.id = defaults.id;
    	      this.linkedServiceDescription = defaults.linkedServiceDescription;
    	      this.linkedServicePrincipal = defaults.linkedServicePrincipal;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.privateZone = defaults.privateZone;
    	      this.resourceRecordSetCount = defaults.resourceRecordSetCount;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder callerReference(String callerReference) {
            this.callerReference = Objects.requireNonNull(callerReference);
            return this;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder linkedServiceDescription(String linkedServiceDescription) {
            this.linkedServiceDescription = Objects.requireNonNull(linkedServiceDescription);
            return this;
        }

        public Builder linkedServicePrincipal(String linkedServicePrincipal) {
            this.linkedServicePrincipal = Objects.requireNonNull(linkedServicePrincipal);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public Builder privateZone(@Nullable Boolean privateZone) {
            this.privateZone = privateZone;
            return this;
        }

        public Builder resourceRecordSetCount(Integer resourceRecordSetCount) {
            this.resourceRecordSetCount = Objects.requireNonNull(resourceRecordSetCount);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetZoneResult build() {
            return new GetZoneResult(arn, callerReference, comment, id, linkedServiceDescription, linkedServicePrincipal, name, nameServers, privateZone, resourceRecordSetCount, tags, vpcId, zoneId);
        }
    }
}
