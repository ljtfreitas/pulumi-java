// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerSeedUrlConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceWebCrawlerSeedUrlConfiguration Empty = new DataSourceWebCrawlerSeedUrlConfiguration();

    @Import(name="seedUrls", required=true)
      private final List<String> seedUrls;

    public List<String> getSeedUrls() {
        return this.seedUrls;
    }

    @Import(name="webCrawlerMode")
      private final @Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode;

    public Optional<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> getWebCrawlerMode() {
        return this.webCrawlerMode == null ? Optional.empty() : Optional.ofNullable(this.webCrawlerMode);
    }

    public DataSourceWebCrawlerSeedUrlConfiguration(
        List<String> seedUrls,
        @Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode) {
        this.seedUrls = Objects.requireNonNull(seedUrls, "expected parameter 'seedUrls' to be non-null");
        this.webCrawlerMode = webCrawlerMode;
    }

    private DataSourceWebCrawlerSeedUrlConfiguration() {
        this.seedUrls = List.of();
        this.webCrawlerMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerSeedUrlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> seedUrls;
        private @Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerSeedUrlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrls = defaults.seedUrls;
    	      this.webCrawlerMode = defaults.webCrawlerMode;
        }

        public Builder seedUrls(List<String> seedUrls) {
            this.seedUrls = Objects.requireNonNull(seedUrls);
            return this;
        }

        public Builder webCrawlerMode(@Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode) {
            this.webCrawlerMode = webCrawlerMode;
            return this;
        }
        public DataSourceWebCrawlerSeedUrlConfiguration build() {
            return new DataSourceWebCrawlerSeedUrlConfiguration(seedUrls, webCrawlerMode);
        }
    }
}
