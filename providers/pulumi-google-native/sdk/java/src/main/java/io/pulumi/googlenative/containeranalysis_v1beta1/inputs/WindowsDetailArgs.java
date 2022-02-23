// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.KnowledgeBaseArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsDetailArgs Empty = new WindowsDetailArgs();

    /**
     * The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar.
     * 
     */
    @InputImport(name="cpeUri", required=true)
      private final Input<String> cpeUri;

    public Input<String> getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The description of the vulnerability.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed kb's presence is considered a fix.
     * 
     */
    @InputImport(name="fixingKbs", required=true)
      private final Input<List<KnowledgeBaseArgs>> fixingKbs;

    public Input<List<KnowledgeBaseArgs>> getFixingKbs() {
        return this.fixingKbs;
    }

    /**
     * The name of the vulnerability.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public WindowsDetailArgs(
        Input<String> cpeUri,
        @Nullable Input<String> description,
        Input<List<KnowledgeBaseArgs>> fixingKbs,
        Input<String> name) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = description;
        this.fixingKbs = Objects.requireNonNull(fixingKbs, "expected parameter 'fixingKbs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WindowsDetailArgs() {
        this.cpeUri = Input.empty();
        this.description = Input.empty();
        this.fixingKbs = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cpeUri;
        private @Nullable Input<String> description;
        private Input<List<KnowledgeBaseArgs>> fixingKbs;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixingKbs = defaults.fixingKbs;
    	      this.name = defaults.name;
        }

        public Builder setCpeUri(Input<String> cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Input.of(Objects.requireNonNull(cpeUri));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFixingKbs(Input<List<KnowledgeBaseArgs>> fixingKbs) {
            this.fixingKbs = Objects.requireNonNull(fixingKbs);
            return this;
        }

        public Builder setFixingKbs(List<KnowledgeBaseArgs> fixingKbs) {
            this.fixingKbs = Input.of(Objects.requireNonNull(fixingKbs));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public WindowsDetailArgs build() {
            return new WindowsDetailArgs(cpeUri, description, fixingKbs, name);
        }
    }
}
