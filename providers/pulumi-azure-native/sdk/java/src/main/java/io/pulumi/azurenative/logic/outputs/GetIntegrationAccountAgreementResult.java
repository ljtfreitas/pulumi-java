// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.AgreementContentResponse;
import io.pulumi.azurenative.logic.outputs.BusinessIdentityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIntegrationAccountAgreementResult {
    /**
     * The agreement type.
     * 
     */
    private final String agreementType;
    /**
     * The changed time.
     * 
     */
    private final String changedTime;
    /**
     * The agreement content.
     * 
     */
    private final AgreementContentResponse content;
    /**
     * The created time.
     * 
     */
    private final String createdTime;
    /**
     * The business identity of the guest partner.
     * 
     */
    private final BusinessIdentityResponse guestIdentity;
    /**
     * The integration account partner that is set as guest partner for this agreement.
     * 
     */
    private final String guestPartner;
    /**
     * The business identity of the host partner.
     * 
     */
    private final BusinessIdentityResponse hostIdentity;
    /**
     * The integration account partner that is set as host partner for this agreement.
     * 
     */
    private final String hostPartner;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The metadata.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIntegrationAccountAgreementResult(
        @CustomType.Parameter("agreementType") String agreementType,
        @CustomType.Parameter("changedTime") String changedTime,
        @CustomType.Parameter("content") AgreementContentResponse content,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("guestIdentity") BusinessIdentityResponse guestIdentity,
        @CustomType.Parameter("guestPartner") String guestPartner,
        @CustomType.Parameter("hostIdentity") BusinessIdentityResponse hostIdentity,
        @CustomType.Parameter("hostPartner") String hostPartner,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("metadata") @Nullable Object metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.agreementType = agreementType;
        this.changedTime = changedTime;
        this.content = content;
        this.createdTime = createdTime;
        this.guestIdentity = guestIdentity;
        this.guestPartner = guestPartner;
        this.hostIdentity = hostIdentity;
        this.hostPartner = hostPartner;
        this.id = id;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The agreement type.
     * 
    */
    public String getAgreementType() {
        return this.agreementType;
    }
    /**
     * The changed time.
     * 
    */
    public String getChangedTime() {
        return this.changedTime;
    }
    /**
     * The agreement content.
     * 
    */
    public AgreementContentResponse getContent() {
        return this.content;
    }
    /**
     * The created time.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The business identity of the guest partner.
     * 
    */
    public BusinessIdentityResponse getGuestIdentity() {
        return this.guestIdentity;
    }
    /**
     * The integration account partner that is set as guest partner for this agreement.
     * 
    */
    public String getGuestPartner() {
        return this.guestPartner;
    }
    /**
     * The business identity of the host partner.
     * 
    */
    public BusinessIdentityResponse getHostIdentity() {
        return this.hostIdentity;
    }
    /**
     * The integration account partner that is set as host partner for this agreement.
     * 
    */
    public String getHostPartner() {
        return this.hostPartner;
    }
    /**
     * The resource id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The metadata.
     * 
    */
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Gets the resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountAgreementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agreementType;
        private String changedTime;
        private AgreementContentResponse content;
        private String createdTime;
        private BusinessIdentityResponse guestIdentity;
        private String guestPartner;
        private BusinessIdentityResponse hostIdentity;
        private String hostPartner;
        private String id;
        private @Nullable String location;
        private @Nullable Object metadata;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountAgreementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreementType = defaults.agreementType;
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.createdTime = defaults.createdTime;
    	      this.guestIdentity = defaults.guestIdentity;
    	      this.guestPartner = defaults.guestPartner;
    	      this.hostIdentity = defaults.hostIdentity;
    	      this.hostPartner = defaults.hostPartner;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder agreementType(String agreementType) {
            this.agreementType = Objects.requireNonNull(agreementType);
            return this;
        }

        public Builder changedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }

        public Builder content(AgreementContentResponse content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder guestIdentity(BusinessIdentityResponse guestIdentity) {
            this.guestIdentity = Objects.requireNonNull(guestIdentity);
            return this;
        }

        public Builder guestPartner(String guestPartner) {
            this.guestPartner = Objects.requireNonNull(guestPartner);
            return this;
        }

        public Builder hostIdentity(BusinessIdentityResponse hostIdentity) {
            this.hostIdentity = Objects.requireNonNull(hostIdentity);
            return this;
        }

        public Builder hostPartner(String hostPartner) {
            this.hostPartner = Objects.requireNonNull(hostPartner);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIntegrationAccountAgreementResult build() {
            return new GetIntegrationAccountAgreementResult(agreementType, changedTime, content, createdTime, guestIdentity, guestPartner, hostIdentity, hostPartner, id, location, metadata, name, tags, type);
        }
    }
}
